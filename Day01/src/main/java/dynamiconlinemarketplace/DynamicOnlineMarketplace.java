package dynamiconlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        // Create product instances
        Product<Books> book = new Product<>("Java Programming", 50.0, new Books());
        Product<Clothing> shirt = new Product<>("T-Shirt", 20.0, new Clothing());
        Product<Gadgets> smartphone = new Product<>("Smartphone", 500.0, new Gadgets());

        // Display initial prices
        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(smartphone);

        // Apply discounts
        MarketplaceUtility.applyDiscount(book, 10);
        MarketplaceUtility.applyDiscount(shirt, 15);
        MarketplaceUtility.applyDiscount(smartphone, 5);

        // Display final prices
        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(smartphone);
    }
}
