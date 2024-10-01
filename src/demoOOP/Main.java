package demoOOP;

public class Main {
    public static void main(String[] args) {
        
        Squirrel zeke;
        Squirrel montgomery;
        Squirrel chang;
        Squirrel splinter;
        Squirrel roadkill;

        zeke = new Squirrel("brown", "small");
        montgomery = new Squirrel("black", "medium");
        chang = new Squirrel("red", "small");
        splinter = new Squirrel("white", "large");
        roadkill = new Squirrel("black", "flat");

        zeke.run();
        chang.run();
        roadkill.run();
        roadkill.kill();
        
    }
}
