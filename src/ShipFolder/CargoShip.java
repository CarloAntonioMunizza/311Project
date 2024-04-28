package ShipFolder;

public class CargoShip extends TransportShip{
    void display() {
        System.out.println("This is your Cargo Ship's Storage: ");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
        System.out.println("This is your Cargo Ship's Upgrades: ");
        for (int i = 0; i < upgrade.length; i++) {
            System.out.println(upgrade[i]);

        }
        System.out.println("This is your Cargo Ship's health: ");
        System.out.println(health);
        System.out.println("This is your Cargo Ship's defense: ");
        System.out.println(defense);
        System.out.println("This is your Cargo Ship's attack: ");
        System.out.println(attack);
    }
}
