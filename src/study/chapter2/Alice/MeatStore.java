package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotEnoughFoodException;
import java.util.Random;

public class MeatStore implements Store{

    private static final Store meatStore = new MeatStore();
    private int quantity;

    private MeatStore() {
        Random random = new Random();
        this.quantity = random.nextInt(100, 1000);
    }

    public static Store getInstance() {
        return meatStore;
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
