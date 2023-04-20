package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotFoundException;

public enum Menu {

    AMERICANO(3000, "americano"),
    LATTE  (4500, "latte"),
    BEVERAGE(4000, "beverage"),
    FRAPPE(5000, "frappe"),
    SODA(3000, "soda"),
    TEA(4000, "tea");

    private int price;
    private String menu;

    private Menu(int price, String menu) {
        this.price = price;
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public static Menu isCafeMenu(String menu) {
        try {
            for (Menu n : values()) {
                if (n.menu.equals(menu)) {
                    System.out.println("손님 " + n.price + "원입니다.");
                    return n;
                }
            }
            throw new MenuNotFoundException();
        } catch (IllegalArgumentException e) {
            System.out.println("손님께서 주문하시려는 메뉴가 저희 카페에 없습니다.");
        }
        return null;
    }
}