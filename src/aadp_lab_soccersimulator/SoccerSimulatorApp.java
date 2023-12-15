/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author Victor
 */
import java.util.Scanner;

public class SoccerSimulatorApp {
    public static void main(String[] args) {
        String dbName = "world_cup";
        String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        DatabaseManager.createSchema(dbName);
        DatabaseManager.useDatabase(dbName);

        do {
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the program.");

            int option = InputValidator.validatePositiveIntegerInput(scanner);

            switch (option) {
                case 1:
                    // Add player logic
                    break;
                case 2:
                    // View players logic
                    break;
                case 3:
                    System.out.println("How many matches would you like to simulate?");
                    int numMatches = InputValidator.validatePositiveIntegerInput(scanner);
                    MatchSimulator.simulateMatches(teams, numMatches);
                    break;
                case 4:
                    System.out.println("Goodbye, and thank you for using the SoccerSimulator!");
                    exit = true;
                    break;
                default:
                    System.out.println("That is an invalid number. Please try again!");
                    break;
            }

        } while (!exit);
    }
}


