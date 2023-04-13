package src.study.chapter2.Alice;

public class MeatGeneralStore extends GeneralStore{

    static GeneralStore instance;
    @Override
    public String getFood() {
        return "meat";
    }

    private MeatGeneralStore() {
    }

    public static GeneralStore getInstance() {
        if (instance == null) {
            instance = new MeatGeneralStore();
        }
        return instance;
    }

    private int quantity = 300;

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void reduceWeight(int weight) {
        this.quantity -= weight;
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
