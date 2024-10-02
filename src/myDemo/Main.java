package myDemo;

public class Main {
    public static void main(String[] args) {
        // create new objects
        Smartphone davesPhone = new Smartphone("iPhone 12 mini", 64, 5.4, true);
        Smartphone ericsPhone = new Smartphone("iPhone 16", 128, 6.1, true);
        Smartphone momsPhone = new Smartphone("iPhone 15 Pro", 256, 6.1, true);

        // display information
        System.out.println(davesPhone);
        System.out.println(ericsPhone);

        // do things to the phones
        davesPhone.ring();
        momsPhone.ring();
        
        // display information
        System.out.println(momsPhone);

        // break the phone
        davesPhone.smash();
        momsPhone.smash();
        davesPhone.repair();

        // display information
        System.out.println(davesPhone);
        System.out.println(momsPhone);

    }
}
