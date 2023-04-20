package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotEnoughFoodException;

import java.util.Random;
import java.util.Scanner;

public class VegetableStore implements Store {
    private static final Store vegetableStore = new VegetableStore();
    private int quantity;
    private final String food;

    private VegetableStore() {
        Random random = new Random();
        this.quantity = random.nextInt(100, 1000);
        this.food = "vegetable";
    }

    public static Store getInstance() {
        return vegetableStore;
    }

    public String getFood() {
        return food;
    }

    @Override
    public void reduceWeight(int weight) {
        this.quantity -= weight;
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
