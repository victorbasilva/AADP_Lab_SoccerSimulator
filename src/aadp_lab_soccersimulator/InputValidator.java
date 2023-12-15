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

public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);

    public static int validatePositiveIntegerInput() {
        int input = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print("Enter a positive integer: ");
                input = Integer.parseInt(scanner.nextLine());

                if (input < 1) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!isValid);

        return input;
    }

    public static String validateTeamInput(String[] teams) {
        String teamName = "";

        do {
            System.out.print("Enter the team name: ");
            teamName = scanner.nextLine();

            if (teamName.equalsIgnoreCase("exit")) {
                break;
            }

            if (!isValidTeam(teams, teamName)) {
                System.out.println("That is not one of the teams. Please try again!");
            }
        } while (teamName.isEmpty());

        return teamName;
    }

    private static boolean isValidTeam(String[] teams, String teamName) {
        for (String team : teams) {
            if (teamName.equalsIgnoreCase(team)) {
                return true;
            }
        }
        return false;
    }

    // Add more validation methods as needed

    static int validatePositiveIntegerInput(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


