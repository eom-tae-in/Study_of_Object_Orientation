package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;
import java.util.Arrays;
import java.util.List;

enum StoreAdapter {

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

    private static Store checkStoreExist(FoodInfo checkingFoodInfo) {
        StoreAdapter checkedFoodInfo = getFoodStore(checkingFoodInfo);
        return checkedFoodInfo.store;
    }

    private static StoreAdapter getFoodStore(FoodInfo checkingFoodInfo) {
        return Arrays.stream(values()).filter(storeAdapter -> storeAdapter.foodInfo.equals(checkingFoodInfo)).findAny()
                .orElseThrow(NotFoundFoodException::new);
    }

    static boolean canNotPassDoor() {
        List<StoreAdapter> growingFoodStores = selectGrowingFoodStores();
        List<StoreAdapter> shorteningFoodStores = selectShorteningFoodStores();
        return (isEmptyInFoodStores(growingFoodStores) || isEmptyInFoodStores(shorteningFoodStores));
    }

    private static List<StoreAdapter> selectGrowingFoodStores() {
        return Arrays.stream(FoodInfo.values()).filter(FoodInfo::isGrowingFood)
                .map(StoreAdapter::getFoodStore).toList();
    }
    private static List<StoreAdapter> selectShorteningFoodStores() {
        return Arrays.stream(FoodInfo.values()).filter(foodInfo -> !(foodInfo.isGrowingFood()))
                .map(StoreAdapter::getFoodStore).toList();
    }

    private static boolean isEmptyInFoodStores(List<StoreAdapter> foodStores) {
        return foodStores.stream().noneMatch(foodStore -> (foodStore.store.checkFoodInStockOrNot()));
    }
}

