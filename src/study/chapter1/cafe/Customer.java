package src.study.chapter1.cafe;

import java.util.Scanner;

public class Customer {

    private final MenuBoard myMenuBoard;

    public Customer() {
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        this.myMenuBoard = MenuBoard.isCafeMenu(menu);
    }

    public MenuBoard getMyMenu() {
        return myMenuBoard;
    }

    void order(Cashier cashier, MenuBoard menuBoard) {
        cashier.ordered(menuBoard);
    }
}
