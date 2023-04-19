package src.study.chapter1.cafe;

import java.util.Scanner;

public class Customer {

    private final Menu myMenu;

    public Customer() {
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        this.myMenu = Menu.isCafeMenu(menu);
    }

    public Menu getMyMenu() {
        return myMenu;
    }

    void order(Cashier cashier, Menu menu) {
        cashier.ordered(menu);
    }
}
