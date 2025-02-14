package smartwarehousemanagementsystem;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getItemCategory();

    @Override
    public String toString() {
        return name;
    }
}
