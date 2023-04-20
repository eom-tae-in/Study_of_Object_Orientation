package src.study.chapter1.cafe;

import java.util.Scanner;

class Customer {

    private final String myMenu;

    Customer() {
        Scanner sc = new Scanner(System.in);
        this.myMenu = sc.next();
    }

    String getMyMenu() {
        return myMenu;
    }

    void order(Cashier cashier) {
        cashier.ordered(Menu.isCafeMenu(myMenu));
    }
}
