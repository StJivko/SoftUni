package MoreNestedLoop;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int maxPoints = 0;
        String name = "";
        String winner = "";


        for (int i = 1; i <= cakes ; i++) {
            name = scanner.nextLine();
            String command = scanner.nextLine();
            int currentPoints = 0;

            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                currentPoints += points;
                command = scanner.nextLine();

            }

            System.out.printf("%s has %d points.%n", name, currentPoints);
            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                winner = name;
                System.out.printf("%s is the new number 1!%n", name);
            }

        }
        System.out.printf("%s won competition with %d points!", winner,maxPoints );


    }
}
