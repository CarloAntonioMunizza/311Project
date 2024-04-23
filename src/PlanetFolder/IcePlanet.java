package PlanetFolder;

public class IcePlanet extends Planet {
	public IcePlanet(String name, int size, int population) {
		super(PlanetType.ICE, name, size, population);
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(200, 50));
		resources.put(ResourceType.WATER, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(50, 50));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(50, 50));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(10, 10));
	}

	@Override
	public String toString() {
		// Custom toString for PlanetFolder.DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Ice ");
		return sb.toString();
	}
}
