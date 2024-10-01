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

        // output the status of the squirrel
        if (roadkill.alive == true) {
            System.out.println("He's alive!");
        } else { 
            System.out.println("He's dead. :(");
        }        

        // unalive them
        roadkill.kill();

        // output the status of the squirrel again
        if (roadkill.alive == true) {
            System.out.println("He's alive!");
        } else { 
            System.out.println("He's dead. :(");
        }
        
    }
}
