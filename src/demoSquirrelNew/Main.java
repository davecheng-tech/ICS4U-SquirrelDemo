package demoSquirrelNew;

public class Main {
    public static void main(String[] args) {

        // create a few new objects using our Squirrel class
        Squirrel player1 = new Squirrel("Zeke", 1, "brown", 2.0);
        Squirrel player2 = new Squirrel("Monty", 10, "white", 10.0);
        Squirrel player3 = new Squirrel("Tanner", 5, "beige", 1.0);

        // show all stats
        player1.displayInfo();
        player2.displayInfo();
        player3.displayInfo();

        System.out.println(""); // line break

        // eat some stuff
        player1.eat("pizza");
        player3.eat("acorns");

        // do more stuff
        player1.run();
        player2.run();

        // eat more stuff
        player1.eat("carrots");

        System.out.println(""); // line break

        // show all stats
        player1.displayInfo();
        player2.displayInfo();
        player3.displayInfo();

        // kill one of them
        player1.kill();

        System.out.println(""); // line break

        // show all stats using string method
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

    }
}
