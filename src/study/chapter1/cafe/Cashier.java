package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotEqualsException;
import java.util.LinkedList;
import java.util.Queue;

class Cashier {

    Queue<Menu> orderedList = new LinkedList<>();

    void ordered(Menu menu) {
        orderedList.add(menu);
    }

    Menu requestMenu(Barista barista) {
        return barista.makeMenu(orderedList.peek());
    }

    void isCustomerMenu(Menu madeMenu) {
        Menu menu = compareMenu(orderedList.peek(), madeMenu);
        printMenuReady(menu);
    }

    private Menu compareMenu(Menu orderedMenu, Menu madeMenu) {
        if (!orderedMenu.equals(madeMenu)) {
            throw new MenuNotEqualsException();
        }
        return orderedList.poll();
    }

    private void printMenuReady(Menu menu) {
        System.out.println("정상적으로 처리되었습니다.");
        System.out.println("주문하신 " + menu.getMenuName() + " 나왔습니다~~");
        System.out.println(menu.getMenuName()+"의 가격은 " + menu.getPrice() + "입니다.");
    }
}
