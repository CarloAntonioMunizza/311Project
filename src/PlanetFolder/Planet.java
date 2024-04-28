package PlanetFolder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Planet {
	protected int upgrades[][] = new int[6][3];
	protected int inventory[] = new int[6];
	protected PlanetType type;
	protected String name;
	protected int size;
	protected int population;
	protected HashMap<ResourceType, Integer> resources = new HashMap<>();

	public int[][] getUpgrades() {
		return upgrades;
	}

	public void setUpgrades(int[][] upgrades) {
		this.upgrades = upgrades;
	}

	public int[] getInventory() {
		return inventory;
	}

	public void setInventory(int[] inventory) {
		this.inventory = inventory;
	}

	public PlanetType getType() {
		return type;
	}

	public void setType(PlanetType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}



	public Planet(PlanetType type, String name, int size, int population) {
		this.type = type;
		this.name = name;
		this.size = size;
		this.population = population;
		initilizeResources();
	}



	protected abstract void initilizeResources();

	protected int generateRandomResourceAmount(int base, int variance) {
		Random random = new Random();
		return base + random.nextInt(variance);
	}

	void resourceExtraction() {
		//logic to gain resources based on extraction rate and density
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" (Size: ").append(size).append(", Population: ").append(population).append(")\n");
		if (!resources.isEmpty()) {
			sb.append("Resources:\n");
			for (Map.Entry<ResourceType, Integer> entry : resources.entrySet()) {
				sb.append(" - ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
			}
		}
		return sb.toString();
	}
}




