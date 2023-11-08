	public class Main {
	    public static void main(String[] args) {
	        StoreInventory storeInventory = new StoreInventory();

	        // Creating products
	        Product product1 = new Product("Chewing Gum", "125", "Snacks", 1.99, "2023-12-31", 6);
	        Product product2 = new Product("Snickers", "250", "Candy", 2.49, "2023-12-31", 6);
	        Product product3 = new Product("M&M's", "425", "Candy", 2.99, "2023-12-31", 6);
	        Product product4 = new Product("Kit Kat", "200", "Chocolate", 1.99, "2023-12-31", 6);
	        Product product5 = new Product("Skittles", "330", "Candy", 1.49, "2023-12-31", 6);
	        Product product6 = new Product("Doritos", "325", "Snacks", 2.99, "2023-12-31", 6);
	        Product product7 = new Product("Bottled Water", "270", "Beverage", 0.99, "2023-12-31", 6);

	        // Adding products to the store inventory
	        storeInventory.addNewProduct(product1);
	        storeInventory.addNewProduct(product2);
	        storeInventory.addNewProduct(product3);
	        storeInventory.addNewProduct(product4);
	        storeInventory.addNewProduct(product5);
	        storeInventory.addNewProduct(product6);
	        storeInventory.addNewProduct(product7);

	        System.out.println("Product Details:");
	        System.out.println("Product Name: " + product1.productName);
	        System.out.println("Product ID: " + product1.productID);
	        System.out.println("Category: " + product1.category);
	        System.out.println("Price: " + product1.price);
	        System.out.println("Expiration Date: " + product1.expirationDate);
	        System.out.println("Makdown Date: " + product1.timeDurationForMarkDown);

	        // Checking if the product is in stock
	        System.out.println("Is the product in stock? " + product1.isInStock());

	        // Removing a product from inventory
	        storeInventory.removeProduct("125");

	        // Checking if the product is in stock after removal
	        System.out.println("Is the product in stock after removal? " + product1.isInStock());
	    }
	}