package AdvancedConditionals;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedBack = scanner.nextLine();
        double price = 0.0;
        int nightsCount = days - 1;

        if (roomType.equals("room for one person")) {
            price = 18;
        }
        switch (roomType) {
            case "apartment":
                if (days < 10) {
                    price = 25 * 0.70;
                } else if (days > 10 && days <= 15) {
                    price = 25 * 0.65;
                } else {
                    price = 25 * 0.50;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = 35 * 0.90;
                } if (days >= 10 && days <= 15) {
                    price = 35 * 0.75;
            }   else {
                    price = 35 * 0.80;
            }
        } double totalPrice = nightsCount * price;
        if (feedBack.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (feedBack.equals("negative")) {
            totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
