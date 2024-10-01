package demoSquirrelImproved;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold Squirrel objects
        ArrayList<Squirrel> allSquirrels = new ArrayList<>();

        // Add Squirrel objects to the ArrayList
        allSquirrels.add(new Squirrel("Zeke", 1, "brown", 2.0));
        allSquirrels.add(new Squirrel("Monty", 10, "white", 10.0));
        allSquirrels.add(new Squirrel("Tanner", 5, "beige", 1.0));

        // Show stats for all squirrels using a loop
        System.out.println("Initial Squirrel Stats:");
        for (Squirrel squirrel : allSquirrels) {
            squirrel.displayInfo();
        }

        System.out.println(""); // Line break

        // Perform actions on the squirrels
        allSquirrels.get(0).eat("pizza");    // Zeke eats pizza
        allSquirrels.get(2).eat("acorns");   // Tanner eats acorns
        allSquirrels.get(0).eat("acorns");    // Zeke eats acorns
        allSquirrels.get(0).eat("acorns");    // Zeke eats acorns

        // Make some squirrels run
        allSquirrels.get(0).run();  // Zeke runs
        allSquirrels.get(1).run();  // Monty runs

        // Zeke eats more
        allSquirrels.get(0).eat("carrots");

        // Kill two of them
        allSquirrels.get(1).kill();
        allSquirrels.get(2).kill();

        System.out.println(""); // Line break

        // Show updated stats
        System.out.println("Updated Squirrel Stats:");
        for (Squirrel squirrel : allSquirrels) {
            if (squirrel.isAlive() == true) {
                squirrel.displayInfo();
            } else {
                System.out.println(squirrel.getName() + " is dead.");
            }
            
        }
    }
}