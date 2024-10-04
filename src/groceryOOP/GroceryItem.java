package groceryOOP;

public class GroceryItem {
    // instance variable
    private String name;
    private double price;
    private int quantity;

    // constructor - note parameters have same name as instance variables, so we use this.
    // public GroceryItem(String name, double price, int quantity) {
    //     this.name = name;
    //     this.price = price;
    //     this.quantity = quantity;
    // }

    // constructor - parameters have different names than instance variables
    public GroceryItem(String newName, double newPrice, int newQuantity) {
        name = newName;
        price = newPrice;
        quantity = newQuantity;
    }

    // methods

    public double getTotalValue() {
        return price * quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getWholesaleCost() {
        return price * 0.90;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }
  
    public String toString() {
        return name + " - $" + price + " Qty. " + quantity;
    }

}
