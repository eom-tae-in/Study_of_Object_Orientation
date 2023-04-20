package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotEqualsException;
import java.util.LinkedList;
import java.util.Queue;

public class Cashier {

    Queue<Menu> orderedList = new LinkedList<>();

    void ordered(Menu menu) {
        orderedList.add(menu);
    }

    Menu requestMenu(Barista barista) {
        return barista.makeMenu(orderedList.peek());
    }

    void isCustomerMenu(Menu madeMenu) {
        try {
            if (!orderedList.peek().equals(madeMenu)) {
                throw new MenuNotEqualsException();
            }
            Menu menu = orderedList.poll();
            System.out.println("정상적으로 처리되었습니다.");
            System.out.println("주문하신 " + menu.getMenuName() + " 나왔습니다~~");
        } catch (IllegalArgumentException e) {
            System.out.println("손님이 주문한 메뉴와 바리스타가 만든 메뉴가 다릅니다.");
        }
    }
}
