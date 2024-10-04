package groceryProc;

public class Main {
    public static void main(String[] args) {
        // Define items, quantities, and prices
        String item1Name = "Soup";
        int item1Qty = 50;
        double item1Price = 2.99;
        double item1Value = 0.0;
        
        String item2Name = "Frozen Pizza";
        int item2Qty = 25;
        double item2Price = 5.99;
        double item2Value = 0.0;

        String item3Name = "Spinach";
        int item3Qty = 35;
        double item3Price = 4.99;
        double item3Value = 0.0;

        // Calculate total value on hand of each inventory item
        item1Value = item1Price * item1Qty;
        item2Value = item2Price * item2Qty;
        item3Value = item3Price * item3Qty;

        // Output total value on hand of each inventory item
        System.out.println(item1Name + ": Total Value $" + item1Value);
        System.out.println(item2Name + ": Total Value $" + item2Value);
        System.out.println(item3Name + ": Total Value $" + item3Value);

    }
    
}
