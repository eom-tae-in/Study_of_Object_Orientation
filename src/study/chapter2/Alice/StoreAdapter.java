package src.study.chapter2.Alice;

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
        Optional<StoreAdapter> any = Arrays.stream(values()).filter(e -> e.food.equals(food)).findAny();
        if (any.isEmpty()) {
            throw new IllegalStateException();
        }
        return any.get().store;
    }

}
