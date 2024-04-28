package ShipFolder;

public class DefensiveShip extends CombatShip{
    void display() {
        System.out.println("This is your Offensive Ship's Upgrades: ");
        for (int i = 0; i < upgrade.length; i++) {
            System.out.println(upgrade[i]);

        }
        System.out.println("This is your Offensive Ship's health: ");
        System.out.println(health);
        System.out.println("This is your Offensive Ship's defense: ");
        System.out.println(defense);
        System.out.println("This is your Offensive Ship's attack: ");
        System.out.println(attack);
    }
}
