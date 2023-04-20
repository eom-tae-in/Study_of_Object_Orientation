package src.study.chapter2.Alice;

public class Door {

    private final int height;

    public Door() {
        this.height = 40;
    }

    public boolean canPassDoor(int aliceHeight) {
        return this.height >= aliceHeight;
    }
}
