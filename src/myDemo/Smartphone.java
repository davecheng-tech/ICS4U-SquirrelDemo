package myDemo;

public class Smartphone {
    // instance variable
    private String model;
    private int memory;
    private double screenSize;
    private boolean isWorking;

    // constructor
    public Smartphone(String model, int memory, double screenSize, boolean isWorking) {
        this.model = model;
        this.memory = memory;
        this.screenSize = screenSize;
        this.isWorking = isWorking;
    }

    // instance methods
    public String toString() {
        return model + " - Memory: " + memory + ", Screen: " + screenSize + ", Working: " + isWorking;
    }
    
}
