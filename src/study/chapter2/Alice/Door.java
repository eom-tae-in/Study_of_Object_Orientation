package src.study.chapter2.Alice;

class Door {

    private final int height;

    Door() {
        this.height = 40;
    }

    boolean canPassDoor(int aliceHeight) {
        return this.height >= aliceHeight;
    }
}
