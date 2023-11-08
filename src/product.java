class Product {
    String productName;
    String productID;
    String category;
    double price;
    boolean inStock;
    String expirationDate;
    int timeDurationForMarkDown;

    public Product(String productName, String productID, String category, double price, String expirationDate, int timeDurationForMarkDown) {
        this.productName = productName;
        this.productID = productID;
        this.category = category;
        this.price = price;
        this.inStock = true;
        this.expirationDate = expirationDate;
        this.timeDurationForMarkDown = timeDurationForMarkDown;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getTimeDurationForMarkDown() {
        return timeDurationForMarkDown;
    }
}