package src.study.chapter2.Alice;

public class VegetableStore extends GeneralStore implements Store {
    static GeneralStore instance;
    private int quantity = 1000;

    @Override
    public String getFood() {
        return "vegetable";
    }

    private VegetableStore() {
    }

    public static GeneralStore getInstance() {
        if (instance == null) {
            instance = new VegetableStore();
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