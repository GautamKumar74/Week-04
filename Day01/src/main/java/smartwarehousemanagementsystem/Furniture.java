package smartwarehousemanagementsystem;

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getItemCategory() {
        return "Furniture";
    }
}
