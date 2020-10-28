package AdvancedConditionals;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;
        String place = "";

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    price = budget * 0.3;
                    break;
                case "winter":
                    price = budget * 0.7;
                    break;
            }
            place = "Bulgaria";
            System.out.printf("Somewhere in %s %n", place);
        }
        else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    price = budget * 0.4;
                    break;
                case "winter":
                    price = budget * 0.8;
                    break;
                }
                place = "Balkans";
                System.out.printf("Somewhere in %s %n", place);
        } else {
            price = budget * 0.9;
            place = "Europe";
            System.out.printf("Somewhere in %s %n", place);
        }


        if (season.equals("summer") && place.equals("Europe")) {
            System.out.printf("Hotel - %.2f", price);

        } else if (season.equals("winter")) {
            System.out.printf("Hotel - %.2f", price);
        }
        else {
            System.out.printf("Camp - %.2f", price);
        }

    }
}
