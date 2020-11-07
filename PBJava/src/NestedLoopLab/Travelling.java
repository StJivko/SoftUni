package NestedLoopLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = 0;
        double saved = 0;

        while (true) {
            String country = scanner.nextLine();
            if (country.equals("End")){
                break;
            }
            double moneyNeeded = Double.parseDouble(scanner.nextLine());

            while (moneyNeeded > savings ) {
                savings = Double.parseDouble(scanner.nextLine());
                saved += savings;
                if (saved >= moneyNeeded){
                    saved =0;
                    savings = 0;
                    break;
                }
            }
            System.out.printf("Going to %s!%n", country);
        }
    }
}
