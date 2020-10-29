package Conditionals;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceOutfit = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;

        double totalPriceOutfit = statists * priceOutfit;
        double totalPrice = decor + totalPriceOutfit;
        double discount = totalPriceOutfit * 0.10;
        double moneyLeft = budget - totalPrice;


        if (statists > 150) {
            moneyLeft = budget - totalPrice + discount;
        }

        if (budget < totalPrice) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(moneyLeft));

        } else if (budget >= totalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
