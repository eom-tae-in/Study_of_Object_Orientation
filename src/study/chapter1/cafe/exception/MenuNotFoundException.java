package src.study.chapter1.cafe.exception;

public class MenuNotFoundException extends IllegalArgumentException{

    public MenuNotFoundException() {
        System.out.println("손님께서 주문하시려는 메뉴가 저희 카페에 없습니다.");
    }
}
