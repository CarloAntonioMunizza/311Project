import GUIPages.GUIMainMenu;
import PlanetFolder.*;

import javax.swing.*;

import java.util.ArrayList;
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
        planets.add(HomePlanet.getInstance());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of your GUI class
                GUIMainMenu myGui = new GUIMainMenu();
                // Configure the main JFrame
                myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myGui.pack(); // Adjusts window to fit components if not already sized
                myGui.setVisible(true); // Make the GUI visible
            }
        });

        //MainMenu mainMenu = new MainMenu();
        //mainMenu.displayMenuInput();

//        for (Planet planet : planets) {
//            System.out.println(planet);
//        }
    }
}


// satellite to discover more planets
// planets have resources and you can mine with upgrades
// planets have limitless resources but different rates of mining
// planets have their own rss inventory
// turn based
// further planets take more time
// cargo ships and buildings cost specific rss
// planets have satellite that reduce risk of travel and reduce travel time
// max satellites have auto trading
// combat is a percentage to encounter pirates
// if combat occurs, have a chance for citical win or lose with losing or gaining rss and losing ships etc