package demoOOP;

public class Squirrel {
    // instance variables (i.e. properties)
    String colour;
    String size;
    boolean alive;
    

    // constructor
    /**
     * Creates an instance of Squirrel
     * @param newColour String specifying the colour of the squirrel
     * @param newSize String describing the size of the squirrel
     */
    public Squirrel(String newColour, String newSize) {
        this.alive = true;
        this.colour = newColour;
        this.size = newSize;
    }


    // instance methods
    public void run() {
        System.out.println("A " + this.colour + " squirrel is running!");
    }

    public void speak() {
        System.out.println("Hi! I'm a " + this.size + " squirrel!");
    }

    public void kill() {
        this.alive = false;
    }

}