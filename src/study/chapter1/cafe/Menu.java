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
    private String menuName;

    private Menu(int price, String menuName) {
        this.price = price;
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public static Menu isCafeMenu(String menu) {
        try {
            for (Menu n : values()) {
                if (n.menuName.equals(menu)) {
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
