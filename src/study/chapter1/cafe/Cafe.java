package src.study.chapter1.cafe;

public class Cafe {

    public static void main(String[] args) {
        Customer customer = new Customer();
        MenuBoard menuBoard = customer.getMyMenu();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        customer.order(cashier, menuBoard);
        MenuBoard madeMenuBoard = cashier.requestMenu(barista, menuBoard);
        cashier.isCustomerMenu(madeMenuBoard);
    }
}
