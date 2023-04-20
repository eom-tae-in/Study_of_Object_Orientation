package src.study.chapter1.cafe;

import java.util.Scanner;

public class Customer {

    private final String myMenu;

    public Customer() {
        Scanner sc = new Scanner(System.in);
        this.myMenu = sc.next();
    }

    public String getMyMenu() {
        return myMenu;
    }

    void order(Cashier cashier) {
        cashier.ordered(Menu.isCafeMenu(myMenu));
    }
}
