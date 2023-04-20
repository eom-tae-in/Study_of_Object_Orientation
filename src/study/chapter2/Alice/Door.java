package src.study.chapter2.Alice;

public class Door {

    private final int height;

    Door() {
        this.height = 40;
    }

    boolean canPassDoor(int aliceHeight) {
        return this.height >= aliceHeight;
    }
}
