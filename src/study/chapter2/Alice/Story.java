package src.study.chapter2.Alice;

import static src.study.chapter2.Alice.Output.*;

class Story {

    public static void main(String[] args) {

        Input input = new Input();
        Door door = new Door();
        printAskHeight();
        Alice alice = new Alice(input.height());
        while (true) {
            printSelectFoodQuestion();
            FoodInfo food = input.food();
            Store store = StoreAdapter.selectStore(food);
            printQuantityQuestion();
            int quantity = input.quantity(store);
            alice.buyFood(store, quantity);
            alice.eat(food, quantity);
            if (alice.tryToPassDoor(door, alice.getHeight())) {
                printSuccessEnterGarden();
                break;
            }
            if (StoreAdapter.canNotPassDoor()) {
                printFailEnterGarden();
                break;
            }
        }
    }
}
