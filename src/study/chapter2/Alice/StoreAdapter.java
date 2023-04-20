package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;

import java.util.Arrays;
import java.util.Optional;

public enum StoreAdapter {

    VEGETABLE_STORE("vegetable", VegetableStore.getInstance()),
    MEAT_STORE("meat", MeatStore.getInstance());

    private String food;
    private Store store;

    StoreAdapter(String food, Store generalStore) {
        this.food = food;
        this.store = generalStore;
    }

    static Store select(String food) {
        checkStoreExist(food);
        return any.get().store;
    }

    private static boolean checkStoreExist(String food) {
        return Arrays.stream(values()).anyMatch(e -> e.food.equals(food));
    }
}
