package src.study.chapter2.Alice;

interface Store {

    void soldFood(int quantity);
    void checkEnoughFood(int quantity);
    boolean checkFoodInStockOrNot();
}
