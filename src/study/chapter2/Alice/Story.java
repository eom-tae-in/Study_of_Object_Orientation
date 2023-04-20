package src.study.chapter2.Alice;

import static src.study.chapter2.Alice.Input.*;
import static src.study.chapter2.Alice.Output.*;

public class Story {

    public static void main(String[] args) {
        printAskHeight();
        Alice alice = new Alice(height());
        printSelectFoodQuestion();
        store = GeneralStore.selectStore(food());
        return store.checkFoodInStockOrNot();
        story = new Story();
        story.setUpStory();
        while (story.selectFood()) {
            printQuantityQuestion();
            int quantity = quantity();
            if (!store.checkEnoughFood(quantity)) {
                printNotEnoughFood();
                continue;
            }
            alice.eat(store.getFood(), quantity);
            store.reduceWeight(quantity);
            if (alice.isPossiblePassDoor()) {
                printSuccessEnterGarden();
                return;
            }
        }
        printFailEnterGarden();
    }

    public void setUpStory() {
        printAskHeight();
        alice = Alice.madeBy(height());
    }

    public boolean selectFood() {
        printSelectFoodQuestion();
        store = GeneralStore.selectStore(food());
        return store.checkFoodInStockOrNot();
    }
}
