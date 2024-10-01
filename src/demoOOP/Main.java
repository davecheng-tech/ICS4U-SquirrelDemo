package demoOOP;

public class Main {
    public static void main(String[] args) {
        
        Squirrel zeke;
        Squirrel montgomery;
        Squirrel roadkill;

        zeke = new Squirrel("brown", "small");
        montgomery = new Squirrel("white", "medium");
        roadkill = new Squirrel("black", "flat");

        zeke.run();
        montgomery.run();
        roadkill.run();
        
        roadkill.kill();

        if (roadkill.alive == true) {
            System.out.println("He's alive!");
        } else { 
            System.out.println("He's dead. :(");
        }
        
    }
}
