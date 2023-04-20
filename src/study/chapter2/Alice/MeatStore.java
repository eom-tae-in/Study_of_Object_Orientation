package src.study.chapter2.Alice;

public class MeatStore extends GeneralStore implements Store{

    private static final GeneralStore meatStore = new MeatStore();
    @Override
    public String getFood() {
        return "meat";
    }

    private MeatStore() {
    }

    public static GeneralStore getInstance() {
        return meatStore;
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
