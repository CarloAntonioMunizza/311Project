package PlanetFolder;

public class OceanicPlanet extends Planet {
	public OceanicPlanet(String name, int size, int population) {
		super(PlanetType.OCEANIC, name, size, population);
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(800, 100));
		resources.put(ResourceType.WATER, generateRandomResourceAmount(1000, 100));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(150, 100));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(50, 20));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(0, 50));
	}

	@Override
	public String toString() {
		// Custom toString for PlanetFolder.DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Oceanic");
		return sb.toString();
	}
}
