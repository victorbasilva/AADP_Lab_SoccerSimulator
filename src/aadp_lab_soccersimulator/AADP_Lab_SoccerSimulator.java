/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author Sam
 * Please put the names and student numbers of the team here:
 * 
 * Name 1: Victor Silva
 * Number 1: 2021259
 * 
 * Name 2: Joelma Rodrigues 
 * Number 2: 2023246
 * 
 * Name 3: Alessandra Cabelliero
 * Number 3: 2021258
 * 
 */

package aadp_lab_soccersimulator;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class AADP_Lab_SoccerSimulator {

    private static final String DB_URL = "jdbc:mysql://localhost/";
    private static final String USER = "football";
    private static final String PASS = "Java is almost as good as football";

    public static void main(String[] args) {
        String dbName = "world_cup";
        String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};

        DatabaseManager.createSchemaAndTables(dbName, teams);

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the program.");

            int option = InputValidator.validatePositiveIntegerInput(scanner);

            switch (option) {
                case 1:
                    enterNewPlayer(teams, scanner);
                    break;
                case 2:
                    viewPlayersOnTeam(teams, scanner);
                    break;
                case 3:
                    simulateMatches(teams, scanner);
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

    private static void enterNewPlayer(String[] teams, Scanner scanner) {
        // Logic for entering a new player
        // Use DatabaseManager.insertPlayer() to insert data into the database
    }

    private static void viewPlayersOnTeam(String[] teams, Scanner scanner) {
        // Logic for viewing players on a team
        // Use DatabaseManager to retrieve and display player data
    }

    private static void simulateMatches(String[] teams, Scanner scanner) {
        // Logic for simulating matches
        // Use MatchSimulator.simulateMatches() to simulate matches
    }
}
