import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();
        planets.add(new DesertPlanet("Tatooine", 5, 100));
        planets.add(new IcePlanet("Hoth", 3, 50));
        planets.add(new MountainPlanet("Everest", 1, 10));
        planets.add(new IndustrialPlanet("Coruscant", 10, 1000));
        planets.add(new DesertPlanet("Arrakis", 7, 200));
        planets.add(new IcePlanet("Antarctica", 2, 20));

        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }
}
