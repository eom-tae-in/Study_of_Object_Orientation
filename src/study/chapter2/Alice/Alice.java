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

    public void eat(String food, int quantity) {
        if (food.equals("meat")) {
            eatMeat(quantity);
        }
        if (food.equals("vegetable")) {
            eatVegetable(quantity);
        }
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
