package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotEqualsException;
import java.util.LinkedList;
import java.util.Queue;

public class Cashier {

    Queue<MenuBoard> orderedList = new LinkedList<>();
    void ordered(MenuBoard menuBoard) {
        orderedList.add(menuBoard);
    }

    MenuBoard requestMenu(Barista barista, MenuBoard menuBoard) {
        return barista.makeMenu(menuBoard);
    }

    void isCustomerMenu(MenuBoard madeMenuBoard) {
        try {
            if (!orderedList.peek().equals(madeMenuBoard)) {
                throw new MenuNotEqualsException();
            }
            MenuBoard menuBoard = orderedList.poll();
            System.out.println("정상적으로 처리되었습니다.");
            System.out.println("주문하신 " + menuBoard.getMenu() + " 나왔습니다~~");
        } catch (IllegalArgumentException e) {
            System.out.println("손님께서 주문하신 메뉴와 바리스타가 만든 메뉴가 다릅니다.");
        }
    }
}
