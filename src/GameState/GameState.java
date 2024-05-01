package GameState;

import PlanetFolder.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static PlanetFolder.ResourceType.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


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

    public static void saveGame() throws IOException {
        InitializeNewGame();
            if (!(Files.exists(FileSystems.getDefault().getPath("Saved Game.ser")))) {
                Path path = FileSystems.getDefault().getPath("Saved Game.ser");
                Files.createFile(path);
            }
        try {
            ObjectOutputStream save = new ObjectOutputStream(Files.newOutputStream(Paths.get("Saved Game.ser")));
            System.out.println("test");
            for (Planet discoveredPlanet : discoveredPlanets) {
                save.writeObject(discoveredPlanet);
                System.out.println("writing to save: " + discoveredPlanet);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }



}
