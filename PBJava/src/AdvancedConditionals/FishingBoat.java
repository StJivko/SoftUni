package AdvancedConditionals;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMen = Integer.parseInt(scanner.nextLine());
        double priceBoat = 0.0;

        if (season.equals("Summer") || season.equals("Autumn")) {
            if (fisherMen <= 6) {
                priceBoat = 4200 * 0.9;
            } else if (fisherMen <= 11) {
                priceBoat = 4200 * 0.85;
            } else {
                priceBoat = 4200 * 0.75;
            }
        } else if (season.equals("Spring")) {
            if (fisherMen <= 6) {
                priceBoat = 3000 * 0.9;
            } else if (fisherMen <= 11) {
                priceBoat = 3000 * 0.85;
            } else {
                priceBoat = 3000 * 0.75;
            }
        } else if (season.equals("Winter")) {
            if (fisherMen <= 6) {
                priceBoat = 2600 * 0.9;
            } else if (fisherMen <= 11) {
                priceBoat = 2600 * 0.85;
            } else {
                priceBoat = 2600 * 0.75;
            }
        }
        if (fisherMen % 2 == 0) {
            if (!season.equals("Autumn")) {
                priceBoat = priceBoat * 0.95;
            }
        } else {
            priceBoat = priceBoat;
        }
        if (budget >= priceBoat) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceBoat - budget);
        }
    }
}
