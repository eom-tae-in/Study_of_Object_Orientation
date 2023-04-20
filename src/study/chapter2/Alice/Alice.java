package src.study.chapter2.Alice;


class Alice {

    private int height;

    public Alice(int height) {
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    void eat(FoodInfo foodInfo, int quantity) {
        if (foodInfo.isGrowingFood()) {
            this.height += quantity;
            return;
        }
        this.height -= quantity;
    }

    void buyFood(Store store, int quantity) {
        store.soldFood(quantity);
    }

    boolean tryToPassDoor(Door door, int aliceHeight) {
        // + 엘리스 위치 이동 관련 코드
        return door.canPassDoor(aliceHeight);
    }
}
