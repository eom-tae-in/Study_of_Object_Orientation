package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodStoreException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum StoreAdapter {

    VEGETABLE_STORE(FoodInfo.VEGETABLE, VegetableStore.getInstance()),
    MEAT_STORE(FoodInfo.MEAT, MeatStore.getInstance());

    private FoodInfo foodInfo;
    private Store store;

    StoreAdapter(FoodInfo foodInfo, Store generalStore) {
        this.foodInfo = foodInfo;
        this.store = generalStore;
    }

    static Store selectStore(FoodInfo foodInfo) {
        return checkStoreExist(foodInfo);
    }

    static Store checkStoreExist(FoodInfo checkingFoodInfo) {
        Optional<StoreAdapter> checkedFoodInfo = getFoodStore(checkingFoodInfo);
        if (checkedFoodInfo.isPresent()) {
            return checkedFoodInfo.get().store;
        }
        throw new NotFoundFoodStoreException();
    }

    private static Optional<StoreAdapter> getFoodStore(FoodInfo checkingFoodInfo) {
        return Arrays.stream(values()).filter(storeAdapter -> storeAdapter.foodInfo.equals(checkingFoodInfo)).findAny();
    }

    static boolean canNotPassDoor() {
        List<StoreAdapter> growingFoodStores = selectGrowingFoodStores();
        List<StoreAdapter> shorteningFoodStores = selectShorteningFoodStores();
        return (isEmptyInFoodStores(growingFoodStores) || isEmptyInFoodStores(shorteningFoodStores));
    }

    private static List<StoreAdapter> selectGrowingFoodStores() {
        return Arrays.stream(FoodInfo.values()).filter(FoodInfo::isGrowingFood)
                .map(foodInfo -> getFoodStore(foodInfo).orElse(null)).toList();
    }
    private static List<StoreAdapter> selectShorteningFoodStores() {
        return Arrays.stream(FoodInfo.values()).filter(FoodInfo::isGrowingFood)
                .map(foodInfo -> getFoodStore(foodInfo).orElse(null)).toList();
    }

    private static boolean isEmptyInFoodStores(List<StoreAdapter> growingFoodStores) {
        return growingFoodStores.stream().noneMatch(storeAdapter -> (storeAdapter.store.checkFoodInStockOrNot()));
    }
}

