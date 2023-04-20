package src.study.chapter1.cafe.exception;

public class MenuNotEqualsException extends IllegalArgumentException{

    public MenuNotEqualsException() {
        System.out.println("손님이 주문한 메뉴와 바리스타가 만든 메뉴가 다릅니다.");
    }
}
