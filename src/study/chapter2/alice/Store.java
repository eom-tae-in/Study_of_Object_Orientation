package src.study.chapter2.alice;

interface Store {

    void soldFood(int quantity);
    void checkEnoughFood(int quantity);
    boolean checkFoodInStockOrNot();
}
