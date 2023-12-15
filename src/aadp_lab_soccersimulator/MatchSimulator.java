/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author Victor
 */
import java.util.Random;

public class MatchSimulator {
    public static void simulateMatches(String[] teams, int numMatches) {
        Random random = new Random();

        for (int matchNum = 1; matchNum <= numMatches; matchNum++) {
            // Logic to simulate matches
            int team1Num = random.nextInt(teams.length);
            String team1 = teams[team1Num];
            int team2Num;

            do {
                team2Num = random.nextInt(teams.length);
            } while (team1Num == team2Num);

            String team2 = teams[team2Num];
            int team1Score = random.nextInt(6);
            int team2Score = random.nextInt(6);

            // Display match results
            System.out.println("Time for match: " + matchNum);
            if (team1Score > team2Score) {
                System.out.println(String.format("Congratulations %s! %s scored %d goals and %s scored %d goals.", team1, team1, team1Score, team2, team2Score));
            } else if (team1Score < team2Score) {
                System.out.println(String.format("Congratulations %s! %s scored %d goals and %s scored %d goals.", team2, team1, team1Score, team2, team2Score));
            } else {
                System.out.println(String.format("It was a draw!! %s scored %d goals and %s scored %d goals.", team1, team1Score, team2, team2Score));
            }
        }
    }
}


