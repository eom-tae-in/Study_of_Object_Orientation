package src.study.chapter2.Alice;

import java.util.Scanner;

public class VegetableStore implements Store {
    private static final Store vegetableStore = new VegetableStore();
    private int quantity;
    private final String food;

    private VegetableStore() {
        Scanner sc = new Scanner(System.in);
        this.quantity = sc.nextInt();
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
    public boolean checkEnoughFood(int quantity) {
        return this.quantity >= quantity;
    }

    @Override
    public boolean checkFoodInStockOrNot() {
        return this.quantity > 0;
    }
}
