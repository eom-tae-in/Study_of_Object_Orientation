package src.study.chapter2.Alice;

public class VegetableGeneralStore extends GeneralStore {
    static GeneralStore instance;
    private int quantity = 1000;

    @Override
    public String getFood() {
        return "vegetable";
    }

    private VegetableGeneralStore() {
    }

    public static GeneralStore getInstance() {
        if (instance == null) {
            instance = new VegetableGeneralStore();
        }
        return instance;
    }

    @Override
    public void reduceWeight(int weight) {
        this.quantity -= (weight * 2);
    }

    @Override
    public boolean checkEnoughFood(int quantity) {
        return this.quantity >= quantity;
    }

    @Override
    public boolean checkFoodInStockOrNot() {
        return this.quantity > 0;
    }
}
