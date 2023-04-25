package src.study.chapter2.alice.exception;

public class NotFoundFoodException extends IllegalArgumentException {
    public NotFoundFoodException() {
        System.out.println("해당 음식을 찾을 수 없습니다.");
        System.out.println("다른 음식으로 다시 입력해주세요.");
    }
}
