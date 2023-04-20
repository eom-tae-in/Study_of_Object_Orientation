package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;
import java.util.Arrays;
import java.util.Optional;

public enum FoodInfo {

    VEGETABLE("vegetable", true),
    MEAT("meat", false);

    private String food;
    private boolean growingFood;

    FoodInfo(String food, boolean growingFood) {
        this.food = food;
        this.growingFood = growingFood;
    }

    boolean isGrowingFood() {
        return growingFood;
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
