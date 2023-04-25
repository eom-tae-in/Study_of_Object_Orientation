package src.study.chapter2.alice.exception;

public class NotFoundFoodStoreException extends IllegalArgumentException{
    public NotFoundFoodStoreException() {
        System.out.println("음식에 맞는 음식 가게를 찾을 수 없습니다.");
    }
}
