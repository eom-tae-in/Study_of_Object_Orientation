package src.study.chapter2.Alice;

import java.util.Scanner;

public class VegetableStore extends GeneralStore implements Store {
    private static final GeneralStore vegetableStore = new VegetableStore();
    private int quantity;

    private VegetableStore() {
        Scanner sc = new Scanner(System.in);
        this.quantity = sc.nextInt();
    }

    public static GeneralStore getInstance() {
        return vegetableStore;
    }

    @Override
    public String getFood() {
        return "vegetable";
    }

    @Override
    public void reduceWeight(int weight) {
        this.quantity -= (weight * 2);
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
