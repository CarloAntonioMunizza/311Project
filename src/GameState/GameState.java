package GameState;

import PlanetFolder.*;
import java.util.ArrayList;
import java.util.List;
import static PlanetFolder.ResourceType.*;



public class GameState {

    //this should have higher level variables and the file IO
    int turnsElapsed;
    public static List<Planet> discoveredPlanets = new ArrayList<>();


    public static void updateState() {
        //updates the game critical variables
    }

    public static void newTurn() {
        for (Planet discoveredPlanet : discoveredPlanets) {
            discoveredPlanet.extractResource(IRON);
        }

    }
    //call everything that needs to happen every time step

    public static void InitializeNewGame() {

        discoveredPlanets.add(HomePlanet.getInstance());

    }



}
