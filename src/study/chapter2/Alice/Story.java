package src.study.chapter2.Alice;

import static src.study.chapter2.Alice.Output.*;

class Story {

    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        Door door = new Door();
        output.printAskHeight();
        Alice alice = new Alice(input.height());
        while (true) {
            output.printSelectFoodQuestion();
            FoodInfo food = input.food();
            Store store = StoreAdapter.selectStore(food);
            output.printQuantityQuestion();
            int quantity = input.quantity(store);
            alice.buyFood(store, quantity);
            alice.eat(food, quantity);
            if (alice.tryToPassDoor(door, alice.getHeight())) {
                output.printSuccessEnterGarden();
                break;
            }
            if (StoreAdapter.canNotPassDoor()) {
                output.printFailEnterGarden();
                break;
            }
        }
    }
}
