package smartwarehousemanagementsystem;

import java.util.List;

// Utility class to display all warehouse items
class WarehouseUtility {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
            System.out.println("Category of Item: " + item.getItemCategory());
        }
    }
}
