package src.study.chapter2.Alice;

public interface Store {

    void reduceWeight(int weight);
    boolean checkEnoughFood(int quantity);
    String getFood();
    boolean checkFoodInStockOrNot();
}
