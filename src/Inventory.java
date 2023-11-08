class StoreInventory {
    String[] products;
    String date;

    
    Product[] items;

    public StoreInventory() {
        this.items = new Product[10];
    }

    public String getProductName(String identifier) {
        for (Product item : items) {
            if (item != null && item.productID.equals(identifier)) {
                return item.productName;
            }
        }
        return "Product not found";
    }

    public void addNewProduct(Product newProduct) {
        // Add a new product to the inventory
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = newProduct;
                break;
            }
        }
    }

    public void removeProduct(String identifier) {
        // Remove a product from inventory based on the productID
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].productID.equals(identifier)) {
                items[i].setInStock(false);
                items[i] = null;
                break;
            }
        }
    }

    public boolean orderNewProduct() {
        // In Stock
        return true;
    }

    public void stockProduct(Product product) {
        // New Product Added
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = product;
                break;
            }
        }
    }
}