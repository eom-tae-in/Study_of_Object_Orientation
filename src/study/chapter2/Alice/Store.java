package src.study.chapter2.Alice;

public interface Store {

    void soldFood(int quantity);
    void checkEnoughFood(int quantity);
    boolean checkFoodInStockOrNot();
}
