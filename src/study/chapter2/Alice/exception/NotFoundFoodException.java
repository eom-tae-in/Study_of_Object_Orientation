package src.study.chapter2.Alice.exception;

public class NotFoundFoodException extends IllegalArgumentException {
    public NotFoundFoodException() {
        System.out.println("해당 음식을 찾을 수 없습니다.");
    }
}
