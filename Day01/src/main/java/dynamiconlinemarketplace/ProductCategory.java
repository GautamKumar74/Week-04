package dynamiconlinemarketplace;

abstract class ProductCategory {
    private String categoryName;

    public ProductCategory(String categoryName){
        this.categoryName= categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
