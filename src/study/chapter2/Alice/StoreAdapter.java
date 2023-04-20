package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;
import src.study.chapter2.Alice.exception.NotFoundFoodStoreException;

import java.util.Arrays;
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
        Optional<StoreAdapter> checkedFoodInfo =
                Arrays.stream(values()).filter(storeAdapter -> storeAdapter.foodInfo.equals(checkingFoodInfo)).findAny();
        if (checkedFoodInfo.isPresent()) {
            return checkedFoodInfo.get().store;
        }
        throw new NotFoundFoodStoreException();
    }
}
