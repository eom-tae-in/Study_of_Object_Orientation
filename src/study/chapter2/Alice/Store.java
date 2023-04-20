package src.study.chapter2.Alice;

public interface Store {

    void soldFood(int weight);
    void checkEnoughFood(int quantity);
    boolean checkFoodInStockOrNot();
}
