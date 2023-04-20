package src.study.chapter2.Alice;


public class Alice {

    private static final int DOOR_HEIGHT = 40;
    private int height;

    public Alice(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void eat(FoodInfo foodInfo, int quantity) {
        if (foodInfo.isGrowingFood()) {
            this.height += quantity;
            return;
        }
        this.height -= quantity;
    }

    public void buyFood(Store store, int quantity) {
        store.soldFood(quantity);
    }

    private void eatMeat(int quantity) {
        this.height += quantity;
    }

    private void eatVegetable(int quantity) {
        this.height -= quantity;
    }

    public boolean isPossiblePassDoor() {
        return this.height <= DOOR_HEIGHT;
    }
}
