package PlanetFolder;

import java.util.HashMap;

public class DesertPlanet extends Planet {
	public DesertPlanet(String name, int size, int population) {
		super(PlanetType.DESERT, name, size, population);
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(300, 100));
		resources.put(ResourceType.WATER, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(200, 100));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(50, 50));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(50, 20));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(0, 50));
	}

	@Override
	public String toString() {
		// Custom toString for PlanetFolder.DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Desert ");
		return sb.toString();
	}
}
