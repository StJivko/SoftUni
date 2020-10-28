package AdvancedConditionals;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (flower) {
            case "Roses":
                if (flowers > 80) {
                    price = (flowers * 5) * 0.90;

                } else {
                    price = flowers * 5;
                } break;
            case "Dahlias":
                if (flowers > 90) {
                    price = (flowers * 3.8) * 0.85;
                } else {
                    price = flowers * 3.80;
                } break;
            case "Tulips":
                if (flowers > 80) {
                    price = (flowers * 2.8) * 0.85;
                } else {
                    price = flowers * 2.8;
                } break;
            case "Narcissus":
                if (flowers < 120) {
                    price = (flowers * 3) * 1.15;
                } else {
                    price = flowers * 3;
            } break;
            case "Gladiolus":
                if (flowers < 80) {
                    price = (flowers * 2.5) * 1.20;
                } else {
                    price = flowers * 2.5;
                } break;
        }
            if (budget >= price) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flower, (budget - price));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
            }



    }
}
