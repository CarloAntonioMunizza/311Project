import java.util.HashMap;

public class IndustrialPlanet extends Planet{
	public IndustrialPlanet(String name, int size, int population) {
		super(PlanetType.INDUSTRIAL, name, size, population);
	}

	@Override
	protected void initilizeResources() {
		resources.put(ResourceType.FOOD, generateRandomResourceAmount(600, 100));
		resources.put(ResourceType.WATER, generateRandomResourceAmount(400, 100));
		resources.put(ResourceType.IRON, generateRandomResourceAmount(1000, 200));
		resources.put(ResourceType.OIL, generateRandomResourceAmount(100, 50));
		resources.put(ResourceType.GOLD, generateRandomResourceAmount(150, 50));
		resources.put(ResourceType.URANIUM, generateRandomResourceAmount(400, 200));
	}

	@Override
	public String toString() {
		// Custom toString for DesertPlanet
		StringBuilder sb = new StringBuilder(super.toString());
		sb.insert(0, "Industrial ");
		return sb.toString();
	}
}
