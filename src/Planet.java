import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Planet {
	protected PlanetType type;
	protected String name;
	protected int size;
	protected int population;
	protected HashMap<ResourceType, Integer> resources = new HashMap<>();

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(type.toString()).append(" Planet ").append(name);
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
