package src.study.chapter2.alice.exception;

public class NotEnoughFoodException extends IllegalArgumentException{
    public NotEnoughFoodException() {
        System.out.println("음식이 충분하지 않습니다. 더 적은 양으로 다시 입력해주세요.");
    }
}
