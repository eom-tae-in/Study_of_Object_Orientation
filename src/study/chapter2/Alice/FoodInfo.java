package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;

import java.util.Arrays;

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

    static void checkFoodExist(String food) {
        if (Arrays.stream(values()).noneMatch(foodInfo -> foodInfo.food.equals(food))) {
            throw new NotFoundFoodException();
        }
    }
}
