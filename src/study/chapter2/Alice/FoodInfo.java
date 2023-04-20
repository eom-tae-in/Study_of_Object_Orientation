package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;

import java.util.Arrays;
import java.util.Optional;

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

    static FoodInfo checkFoodExist(String checkingFood) {
        Optional<FoodInfo> checkedFood =
                Arrays.stream(values()).filter(foodInfo -> foodInfo.food.equals(checkingFood)).findAny();
        if (checkedFood.isPresent()) {
            return checkedFood.get();
        }
        throw new NotFoundFoodException();
    }
}
