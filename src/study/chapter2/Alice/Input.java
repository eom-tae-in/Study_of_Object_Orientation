package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotEnoughFoodException;
import src.study.chapter2.Alice.exception.NotFoundFoodException;

import java.util.Scanner;

public class Input {

    private Store store;

    Scanner sc = new Scanner(System.in);
    public int height() {
        return sc.nextInt();
    }
    public String food() {
        try {
            String food = sc.next();
            StoreAdapter.checkStoreExist(food);
            return food;
        } catch (NotFoundFoodException e) {
            System.out.println(e.getMessage());
            return food();
        }
    }
    public int quantity(Store store) {
        try {
            int quantity = sc.nextInt();
            store.checkEnoughFood(quantity);
            return quantity;
        } catch (NotEnoughFoodException e) {
            System.out.println(e.getMessage());
            return quantity(store);
        }
    }
}
