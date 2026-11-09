// Main App Class
public class CafeApp {
    public static void main(String[] args) {
        // =====================================
        // CUSTOMER 1: STUDENT
        // =====================================
        Customer customer1 = new Customer("Ana Reyes", true);

        Beverage latte = new Beverage("Iced Latte", 95, "B-01", "L");
        Pastry ensaymada = new Pastry("Ensaymada", 45, "P-01", true);
        Meal adobo = new Meal("Chicken Adobo", 110, "M-01", true, 1);

        Pastry cookie = new Pastry();
        cookie.setName("Cookie");
        cookie.setBasePrice(30);
        cookie.setItemCode("P-02");
        cookie.setWarmed(false);

        Order order1 = new Order("1001", customer1);
        order1.addItem(latte);
        order1.addItem(ensaymada);
        order1.addItem(adobo);
        order1.addItem(cookie);

        order1.printReceipt();

        // =====================================
        // INVALID SETTER DEMO
        // =====================================
        System.out.println();
        latte.setBasePrice(-5);

        // =====================================
        // CUSTOMER 2: NON-STUDENT
        // =====================================
        Customer customer2 = new Customer("Ben Cruz");

        Beverage hotChocolate = new Beverage();
        hotChocolate.setName("Hot Chocolate");
        hotChocolate.setItemCode("B-02");
        hotChocolate.setSize("M");
        hotChocolate.setBasePrice(-5);
        hotChocolate.setBasePrice(80);

        Meal beefTapa = new Meal();
        beefTapa.setName("Beef Tapa");
        beefTapa.setBasePrice(130);
        beefTapa.setItemCode("M-02");
        beefTapa.setUpsized(false);
        beefTapa.setExtraSides(0);

        Order order2 = new Order("1002", customer2);
        order2.addItem(hotChocolate);
        order2.addItem(beefTapa);
        order2.printReceipt(20.0);

        // =====================================
        // EXTRA DEMO
        // =====================================
        System.out.println();
        System.out.println("=== EXTRA DEMONSTRATION ===");

        Customer customer3 = new Customer();
        customer3.setName("Student Customer");
        customer3.setStudent(true);

        customer3.addPoints(5);
        customer3.addPoints(150.00);

        System.out.println("Customer: " + customer3.getName());
        System.out.println("Loyalty points: " + customer3.getLoyaltyPoints());
    }
}
