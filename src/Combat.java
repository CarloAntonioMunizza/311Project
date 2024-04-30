import java.util.Random;
import java.util.Scanner;

public class Combat {

    void combatChance(int chance, int health, int attack, int defense, int enHealth) { //The Chance statistic, player stats and the enemy ship's health
        Random random = new Random();
        if (random.nextInt(11) > chance) { //gets random number 0-10. If bigger than the chance at the given time, combat starts
            combat(health, attack, defense, enHealth);
        }
    }

    void combat(int health, int attack, int defense, int enHealth) { //Player Statistics and Enemy Health
        do {
            Random random = new Random();
            System.out.println("Would you like to commit to offense(1) or defense(2)?");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                if (random.nextInt(11) > attack) {
                    System.out.println("You've lost");
                    health = health - 3;
                } else if (random.nextInt(11) < attack) {
                    System.out.println("You've hurt the enemy!");
                    enHealth = health - 2;
                    health--;
                } else if (random.nextInt(11) == attack) {
                    System.out.println("You and the enemy have traded");
                    enHealth--;
                    health = health - 2;
                } else if (random.nextInt(11) == 0) {
                    System.out.println("CRITICAL FAILURE");
                    health = health - 4;
                } else if (random.nextInt(11) == 10) {
                    System.out.println("CRITICAL SUCCESS");
                    enHealth = health - 4;
                }
            }
                else if (choice == 2) {
                    if (random.nextInt(11) > defense) {
                        System.out.println("You've lost");
                        health = health - 2;
                    } else if (random.nextInt(11) < defense) {
                        System.out.println("You've protected yourself");
                    } else if (random.nextInt(11) == defense) {
                        System.out.println("You've barely protected yourself");
                        health--;
                    } else if (random.nextInt(11) == 0) {
                        System.out.println("CRITICAL FAILURE");
                        health = health - 3;
                    } else if (random.nextInt(11) == 10) {
                        System.out.println("CRITICAL SUCCESS");
                        enHealth = enHealth - 1;
                    }
                }


        } while (enHealth > 0 || health > 0);
        if (enHealth == 0) {
            System.out.println("You've Won!");
            rewards(health, enHealth);
        }
        else if (health == 0) {
            System.out.println("You've Lost!");
            theft(health, enHealth);
        }
    }

    void rewards(int health, int enhealth) { //gets rewards
        int chance = health-enhealth;
        for (int i = 0; i < chance; i++) { //will randomly generate rewards, but need to figure out what rewards there are

        }
    }

    void theft(int health, int enhealth) {
        int chance = enhealth - health;
        for (int i = 0; i < chance; i++) { //same as rewards, but with the enemy taking from the player

        }
    }
}



