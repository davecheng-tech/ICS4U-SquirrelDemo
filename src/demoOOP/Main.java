package demoOOP;

public class Main {
    public static void main(String[] args) {

        // create a few new objects using our Squirrel class
        Squirrel zeke;
        Squirrel montgomery;
        Squirrel roadkill;

        zeke = new Squirrel("brown", "small");
        montgomery = new Squirrel("white", "medium");
        roadkill = new Squirrel("black", "flat");

        // do some stuff
        zeke.run();
        montgomery.run();
        roadkill.run();

        // do some more stuff
        zeke.speak();
        montgomery.speak();
        roadkill.speak();

        // output the status of the squirrel
        if (roadkill.alive == true) {
            System.out.println("He's alive!");
        } else { 
            System.out.println("He's dead. :(");
        }        

        // oh no, a car
        System.out.println("A car speeds down the road.");
        roadkill.kill();

        // output the status of the squirrel again
        if (roadkill.alive == true) {
            System.out.println("He's alive!");
        } else { 
            System.out.println("He's dead. :(");
        }
        
    }
}
