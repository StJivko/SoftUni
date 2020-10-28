package BasicsLabExcercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double moneyForOneDay = (cakePrice + wafflesPrice + pancakesPrice) * cooks;
        double moneyForAllTheDays = moneyForOneDay * days;

        double totalMoney = moneyForAllTheDays - (moneyForAllTheDays / 8);

        System.out.printf("%.2f", totalMoney);


    }
}
