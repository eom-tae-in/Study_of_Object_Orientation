package src.study.chapter1.cafe;

import src.study.chapter1.cafe.exception.MenuNotFoundException;

import java.util.Arrays;
import java.util.Optional;

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
        return checkMenu(menu);
    }

    private static Menu checkMenu(String checkingMenu) {
        Optional<Menu> checkedMenu = Arrays.stream(values()).filter(menu -> menu.menuName.equals(checkingMenu)).findAny();
        if (checkedMenu.isEmpty()) {
            throw new MenuNotFoundException();
        }
        return checkedMenu.get();
    }
}
