package assign.to.us;

class Ecommerce {
    int prod_id;
    String name, brand;
    double price;
    static double discount = 5.0; // Default discount
 
    // Constructor
    public Ecommerce(int prod_id, String name, String brand, double price) {
        this.prod_id = prod_id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
 
    // Method to calculate the price after discount
    public double original() {
        return price - (price * discount / 100);
    }
 
    // Method to display details
    public void print() {
        System.out.println("Product ID: " + prod_id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + original());
        System.out.println("------------------------");
    }
 
    // Method to apply special discounts
    public void applySpecialDiscount(String category) {
        if (category.equalsIgnoreCase("electronics")) {
            discount = 10.0;
        } else if (category.equalsIgnoreCase("food")) {
            discount = 30.0;
        }
    }
 
    public static void main(String[] args) {
        // Creating electronic products
        Ecommerce prod1 = new Ecommerce(101, "Laptop", "Dell", 60000);
        Ecommerce prod2 = new Ecommerce(102, "Smartphone", "Samsung", 30000);
 
        // Creating food items
        Ecommerce prod3 = new Ecommerce(103, "Chocolate", "Cadbury", 500);
        Ecommerce prod4 = new Ecommerce(104, "Biscuits", "Oreo", 200);
 
        // Applying default discount and displaying prices
        System.out.println("Applying 5% Default Discount:");
        prod1.print();
        prod2.print();
        prod3.print();
        prod4.print();
 
        // Applying special discount on electronics (10%)
        prod1.applySpecialDiscount("electronics");
        System.out.println("Applying 10% Discount on Electronics:");
        prod1.print();
        prod2.print();
 
        // Applying special discount on food items (30%)
        prod3.applySpecialDiscount("food");
        System.out.println("Applying 30% Discount on Food Items:");
        prod3.print();
        prod4.print();
    }
}
