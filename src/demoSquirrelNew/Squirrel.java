package demoSquirrelNew;

public class Squirrel {
    // INSTANCE VARIABLES
    private String name;
    private int age;
    private String colour;
    private double weight;
    private boolean alive;
    

    // CONSTRUCTOR
    /**
     * Method to create a new instance of Squirrel
     * @param newName Name of squirrel, string.
     * @param newAge Age of squirrel, integer.
     * @param newColour Colour of squirrel's fur, string.
     * @param newWeight Weight of squirrel, in kg.
     */
    public Squirrel(String newName, int newAge, String newColour, double newWeight) {
        name = newName;
        age = newAge;
        colour = newColour;
        weight = newWeight;
        alive = true;
    }


    // INSTANCE METHODS
    // Method to make the squirrel run 
    public void run() {
        System.out.println(name + " is running!");
    }

    // Method to make the squirrel eat
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        weight += 0.1; // squirrel gains some weight
    }

    // Method to die
    public void kill() {
        alive = false;
    }

    // Return alive state
    public boolean isAlive() {
        return this.alive;
    }

    // Method to display squirrel statistics
    public void displayInfo() {
        System.out.println("Squirrel Details - Name: " + name + ", Age: " + age + 
                           " years, Fur: " + colour + ", Weight: " + weight + " kg");
    }

    // toString() method
    public String toString() {
        return "Squirrel Details - Name: " + name + ", Age: " + age + 
        " years, Fur: " + colour + ", Weight: " + weight + " kg";

    }

}