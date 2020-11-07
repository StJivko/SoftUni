package ExamExercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pen = 5.80;
        double markers = 7.20;
        double peparat = 1.20;

//        Първи ред - брой пакети химикали. Цяло число в интервала [0...100]
// Втори ред - брой пакети маркери. Цяло число в интервала [0...100]
// Трети ред - литър препарат за почистване на дъска. Реално число в интервала [0.00…50.00]
// Четвърти ред - процентът намаление. Цяло число в интервала [0...100]

        int packagesPens = Integer.parseInt(scanner.nextLine());
        int packagesMarkers = Integer.parseInt(scanner.nextLine());
        double litersPreparat = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double discount2 = (double) discount / 100;

        double penPrice = pen * packagesPens;
        double markersPrice = markers * packagesMarkers;
        double preparatPrice = peparat * litersPreparat;
        double totalPrice = (penPrice + markersPrice + preparatPrice);
        double totalWithDiscount = totalPrice - (discount2 * totalPrice);
        System.out.printf("%.3f", totalWithDiscount);
    }
}
