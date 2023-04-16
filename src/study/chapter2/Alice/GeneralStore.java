package src.study.chapter2.Alice;

public abstract class GeneralStore implements Store{

    static GeneralStore selectStore(String food) {
        if (food.equals("meat")) {
            return MeatStore.getInstance();
        }
        return VegetableStore.getInstance();
    }
}
