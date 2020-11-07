package NestedLoopLab;

import java.util.Scanner;

public class TestTravelling {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            String destination = keyboard.nextLine();
            if (destination.equals("End")) {
                break;
            }

            double price = Double.parseDouble(keyboard.nextLine());

            while (price > 0) {
                price -= Double.parseDouble(keyboard.nextLine());
            }

            System.out.printf("Going to %s!%n", destination);
        }
    }
}
