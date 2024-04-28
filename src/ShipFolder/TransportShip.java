package ShipFolder;

public abstract class TransportShip extends Ship{
	protected int storage[] = new int[6];
	protected int upgrade[] = new int[6];
	protected int health;
	protected int defense;
	protected int attack;

	void display() {
		System.out.println("This is your Transport Ship's Storage: ");
		for (int i = 0; i < storage.length; i++) {
			System.out.println(storage[i]);
		}
		System.out.println("This is your Transport Ship's Upgrades: ");
		for (int i = 0; i < upgrade.length; i++) {
			System.out.println(upgrade[i]);

		}
		System.out.println("This is your Transport Ship's health: ");
		System.out.println(health);
		System.out.println("This is your Transport Ship's defense: ");
		System.out.println(defense);
		System.out.println("This is your Transport Ship's attack: ");
		System.out.println(attack);
	}
}
