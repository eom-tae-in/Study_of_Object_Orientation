package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotFoundException;

public enum MenuBoard {

    AMERICANO(3000, "americano"),
    LATTE  (4500, "latte"),
    BEVERAGE(4000, "beverage"),
    FRAPPE(5000, "frappe"),
    SODA(3000, "soda"),
    TEA(4000, "tea");

    private int price;
    private String menu;

    private MenuBoard(int price, String menu) {
        this.price = price;
        this.menu = menu;
    }

    public int getPrice() {
        return price;
    }

    public String getMenu() {
        return menu;
    }

    public static MenuBoard isCafeMenu(String menu) {
        try {
            for (MenuBoard n : values()) {
                if (n.menu.equals(menu)) {
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
