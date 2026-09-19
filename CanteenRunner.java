class Item {
    String itemName;
    int stock;

    // Constructor resolving parameter name clashes using the 'this' keyword
    public Item(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    // Method to restock item, resolving parameter clash using 'this' keyword
    public void restock(int stock) {
        this.stock += stock;
    }
}

public class CanteenRunner {
    public static void main(String[] args) {
        // Create an array of 4 Item objects with different starting stock levels
        Item[] items = {
            new Item("Samosa", 15),
            new Item("Tea Powder", 40),
            new Item("Bread", 8),
            new Item("Biscuit Packs", 25)
        };

        // Loop over the items array, apply restock(20), and print details
        for (Item item : items) {
            item.restock(20);
            System.out.println(item.itemName + " | Final Stock: " + item.stock);
        }
    }
}