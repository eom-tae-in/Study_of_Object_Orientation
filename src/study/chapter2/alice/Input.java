package src.study.chapter2.alice;

import src.study.chapter2.alice.exception.NotEnoughFoodException;
import src.study.chapter2.alice.exception.NotFoundFoodException;
import java.util.Scanner;

class Input {

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
