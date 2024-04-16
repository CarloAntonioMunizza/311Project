package PlanetFolder;

import java.util.HashMap;

public class MountainPlanet extends Planet {
	public MountainPlanet(String name, int size, int population) {
		super(PlanetType.MOUNTAIN, name, size, population);
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.WATER, generateRandomResourceAmount(300, 50));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(400, 100));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(50, 50));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(10, 10));
	}

	@Override
	public String toString() {
		// Custom toString for PlanetFolder.DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Mountain ");
		return sb.toString();
	}
}
