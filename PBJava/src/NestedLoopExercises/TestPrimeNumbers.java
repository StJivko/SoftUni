package NestedLoopExercises;

import java.util.Scanner;

public class TestPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!line.equals("stop")) {
            boolean isNotPrime = false;

            int number = Integer.parseInt(line);

            if (number < 0) {
                System.out.println("Number is negative.");
                line = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i ++) {

                if (number % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (isNotPrime) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }
            line = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
