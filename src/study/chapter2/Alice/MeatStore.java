package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;

import java.util.Scanner;

public class MeatStore implements Store{

    private static final Store meatStore = new MeatStore();
    private int quantity;
    private final String food;

    private MeatStore() {
        Scanner sc = new Scanner(System.in);
        this.quantity = sc.nextInt();
        this.food = "meat";
    }

    public static Store getInstance() {
        return meatStore;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFood() {
        return food;
    }

    @Override
    public void soldFood(int weight) {
        this.quantity -= weight;
    }

    @Override
    public void checkEnoughFood(int quantity) {
        if (this.quantity >= quantity) {
            throw new NotFoundFoodException();
        }
    }

    @Override
    public boolean checkFoodInStockOrNot() {
        return this.quantity > 0;
    }
}
