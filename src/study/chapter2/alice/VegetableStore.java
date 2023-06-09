package src.study.chapter2.alice;

import src.study.chapter2.alice.exception.NotEnoughFoodException;
import java.util.Random;

class VegetableStore implements Store {

    private static final Store vegetableStore = new VegetableStore();
    private int quantity;

    private VegetableStore() {
        Random random = new Random();
        this.quantity = random.nextInt(100, 1000);
    }

    static Store getInstance() {
        return vegetableStore;
    }

    @Override
    public void soldFood(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public void checkEnoughFood(int quantity) {
        if (this.quantity < quantity) {
            throw new NotEnoughFoodException();
        }
    }

    @Override
    public boolean checkFoodInStockOrNot() {
        return this.quantity > 0;
    }
}
