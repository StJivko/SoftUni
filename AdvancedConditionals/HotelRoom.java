package AdvancedConditionals;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numNights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartment = 0.0;


        switch (month) {
            case "May":
            case "October":
                if (numNights > 7 && numNights < 14) {
                    studio = 50 * 0.95;
                    apartment = 65;
                } else if (numNights > 14) {
                    studio = 50 * 0.70;
                    apartment = 65 * 0.90;
                } else {
                    studio = 50;
                    apartment = 65;
                }
                break;
            case "June":
            case "September":
                if (numNights > 14) {
                    studio = 75.20 * 0.80;
                    apartment = 68.70 * 0.90;
                } else {
                    studio = 75.20;
                    apartment = 68.70;
                }
                break;
            case "July":
            case "August":
                if (numNights > 14) {
                    apartment = 77 * 0.90;
                    studio = 76;
                } else {
                    studio = 76;
                    apartment = 77;
                }
        }
        double priceApartment = numNights * apartment;
        double priceStudio = numNights * studio;

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
