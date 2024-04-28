package ShipFolder;

public class TankerShip extends CargoShip{
    protected int capacity; //how much of any one liquid it can hold

    void display() {
        System.out.println("This is your Tanker Ship's Storage: ");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
        System.out.println("This is your Tanker Ship's Upgrades: ");
        for (int i = 0; i < upgrade.length; i++) {
            System.out.println(upgrade[i]);

        }
        System.out.println("This is your Tanker Ship's capacity: ");
        System.out.println(capacity);
        System.out.println("This is your Tanker Ship's health: ");
        System.out.println(health);
        System.out.println("This is your Tanker Ship's defense: ");
        System.out.println(defense);
        System.out.println("This is your Tanker Ship's attack: ");
        System.out.println(attack);
    }
}
