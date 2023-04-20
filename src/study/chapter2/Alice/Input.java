package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotEnoughFoodException;
import src.study.chapter2.Alice.exception.NotFoundFoodException;
import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    int height() {
        return sc.nextInt();
    }

    FoodInfo food() {
        try {
            String food = sc.next();
            return FoodInfo.checkFoodExist(food);
        } catch (NotFoundFoodException e) {
            return food();
        }
    }

    int quantity(Store store) {
        try {
            int quantity = sc.nextInt();
            store.checkEnoughFood(quantity);
            return quantity;
        } catch (NotEnoughFoodException e) {
            return quantity(store);
        }
    }
}
