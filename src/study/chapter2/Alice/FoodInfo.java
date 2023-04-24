package src.study.chapter2.Alice;

import src.study.chapter2.Alice.exception.NotFoundFoodException;
import java.util.Arrays;
import java.util.Optional;

enum FoodInfo {

    VEGETABLE("vegetable", true),
    MEAT("meat", false);

    private final String food;
    private final boolean growingFood;

    FoodInfo(String food, boolean growingFood) {
        this.food = food;
        this.growingFood = growingFood;
    }

    boolean isGrowingFood() {
        return growingFood;
    }

    static FoodInfo checkFoodExist(String checkingFood) {
        return getFood(checkingFood);
    }
    private static FoodInfo getFood(String checkingFood) {
        return Arrays.stream(values()).filter(foodInfo -> foodInfo.food.equals(checkingFood))
                .findAny().orElseThrow(NotFoundFoodException::new);
    }
}
