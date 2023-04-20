package src.study.chapter2.Alice;

import java.util.Scanner;

public class MeatStore extends GeneralStore implements Store{

    private static final GeneralStore meatStore = new MeatStore();
    private int quantity;
    private final String food;

    private MeatStore() {
        Scanner sc = new Scanner(System.in);
        this.quantity = sc.nextInt();
        this.food = "meat";
    }

    public static GeneralStore getInstance() {
        return meatStore;
    }

    public int getQuantity() {
        return quantity;
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
