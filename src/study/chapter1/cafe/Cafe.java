package src.study.chapter1.cafe;

class Cafe {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        customer.order(cashier);
        Menu madeMenu = cashier.requestMenu(barista);
        cashier.isCustomerMenu(madeMenu);
    }
}
