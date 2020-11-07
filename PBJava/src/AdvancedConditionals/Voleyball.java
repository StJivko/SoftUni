package AdvancedConditionals;

import java.util.Scanner;

public class Voleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        int countHolidays = Integer.parseInt(scanner.nextLine());
        int weekendsAtHome = Integer.parseInt(scanner.nextLine());
        int weekendsToPLayInSofa = 48 - weekendsAtHome;
        double gamesSofiaWeekend = weekendsToPLayInSofa * 0.75;
        double gamesSofiaHolidays = countHolidays * 0.66666667;
        double totalGames = gamesSofiaHolidays + gamesSofiaWeekend + weekendsAtHome;

        if (typeYear.equals("leap")) {
            totalGames = totalGames * 1.15;
        }
        System.out.printf("%.0f", Math.floor(totalGames));

//        Igri v sofq
//        double gamesInSofia = (weekendsToPLayInSofa * 0.75) + (countHolidays * 0.66);
//        double gamesAtHome = weekendsAtHome;
//        double totalGames = (gamesAtHome + gamesInSofia);
//
//        if ("leap".equals(typeYear)) {
//           totalGames = (totalGames * 1.15);
//        }
//
//        System.out.printf("%.0f",Math.floor(totalGames));
    }
}
