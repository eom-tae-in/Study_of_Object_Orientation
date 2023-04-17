package src.study.chapter1.cafe;

public class Cafe {

    public static void main(String[] args) {
        Customer customer = new Customer();
        MenuBoard menu = customer.getMyMenu();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        customer.order(cashier, menu);
        MenuBoard madeMenu = cashier.requestMenu(barista, menu);
        cashier.isCustomerMenu(madeMenu);
    }
}
