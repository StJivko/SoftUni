package PreExamBasic;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations ; i++) {

            double expected = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            int digs = 0;
            double quantity = 0;

            for (int j = 1; j <= days ; j++) {
                digs = days;
                double gold = Double.parseDouble(scanner.nextLine());
                quantity += gold;

            }
            double average = quantity / days;
            if (average >= expected) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            } else {
                System.out.printf("You need %.2f gold.%n", expected - average);
            }

        }
    }
}
