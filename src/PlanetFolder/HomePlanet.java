package PlanetFolder;

public class HomePlanet extends Planet{
	private static HomePlanet instance;

	private HomePlanet(String name, int size, int population) {
		super(PlanetType.HOME, name, size, population);
	}

	public static HomePlanet getInstance() {
		if (instance == null) {
			instance = new HomePlanet("Home", 5, 100);
		}
		return instance;
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.WATER, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(500, 100));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(500, 100));
	}

	@Override
	public String toString() {
		// Custom toString for PlanetFolder.DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Home ");
		return sb.toString();
	}

}
