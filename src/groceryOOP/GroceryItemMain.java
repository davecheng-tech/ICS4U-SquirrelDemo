package groceryOOP;

public class GroceryItemMain {
    public static void main(String[] args) {
        // create item objects
        GroceryItem item1 = new GroceryItem("Soup", 2.99, 50);
        GroceryItem item2 = new GroceryItem("Frozen Pizza", 5.99, 20);
        GroceryItem item3 = new GroceryItem("Spinach", 4.99, 35);

        // System.out.println(item1.getName() + ": Total Value $" + item1.getTotalValue());
        // System.out.println(item2.getName() + ": Total Value $" + item2.getTotalValue());
        // System.out.println(item3.getName() + ": Total Value $" + item3.getTotalValue());

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }
}
