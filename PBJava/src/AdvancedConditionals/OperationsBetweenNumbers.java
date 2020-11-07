package AdvancedConditionals;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.0;

            if (operator.equals("+")) {
                result = n1 + n2;
                System.out.printf("%.0f %s = %.2f", n1, operator, result);
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s = %.2f - even", n1, operator, result);
                } else  {
                    System.out.printf("%.0f %s = %.2f - odd", n1, operator, result);
                }
            }
    }
}
