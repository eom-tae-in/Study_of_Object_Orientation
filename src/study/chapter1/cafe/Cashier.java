package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotEqualsException;
import java.util.LinkedList;
import java.util.Queue;

public class Cashier {

    Queue<Menu> orderedList = new LinkedList<>();
    void ordered(Menu menu) {
        orderedList.add(menu);
    }

    Menu requestMenu(Barista barista, Menu menu) {
        return barista.makeMenu(menu);
    }

    void isCustomerMenu(Menu madeMenu) {
        try {
            if (!orderedList.peek().equals(madeMenu)) {
                throw new MenuNotEqualsException();
            }
            orderedList.poll();
            System.out.println("정상적으로 처리되었습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("손님께서 주문하신 메뉴와 바리스타가 만든 메뉴가 다릅니다.");
        }
    }
}
