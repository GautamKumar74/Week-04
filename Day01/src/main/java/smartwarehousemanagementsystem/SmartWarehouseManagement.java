package smartwarehousemanagementsystem;

public class SmartWarehouseManagement {
    public static void main(String[] args) {
        // Create storage instances
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        groceriesStorage.addItem(new Groceries("Apple"));
        groceriesStorage.addItem(new Groceries("Milk"));

        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        // Display items using wildcard method
        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.displayItems(furnitureStorage.getAllItems());
    }
}
