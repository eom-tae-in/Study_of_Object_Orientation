package src.study.chapter2.Alice;

public enum FoodInfo {

    VEGETABLE("vegetable","plus"),
    MEAT("meat", "minus");

    private String operator;
    private String food;

    FoodInfo(String food, String operator) {
        this.food = food;
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public String getFood() {
        return food;
    }
}
