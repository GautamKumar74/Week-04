package smartwarehousemanagementsystem;

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getItemCategory() {
        return "Groceries";
    }
}