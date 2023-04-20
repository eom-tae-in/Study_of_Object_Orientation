package src.study.chapter2.Alice;


public class Alice {

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

    public boolean tryToPassDoor(Door door, int aliceHeight) {
        // + 엘리스 위치 이동 관련 코드
        return door.canPassDoor(aliceHeight);
    }
}
