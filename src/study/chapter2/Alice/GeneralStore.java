package src.study.chapter2.Alice;

public abstract class GeneralStore{

    abstract void reduceWeight(int weight);
    abstract boolean checkEnoughFood(int quantity);
    abstract String getFood();

    abstract boolean checkFoodInStockOrNot();

    static GeneralStore selectStore(String food) {
        if (food.equals("meat")) {
            return MeatGeneralStore.getInstance();
        }
        return VegetableGeneralStore.getInstance();
    }
}
