package ForLoopMoreEx;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumber = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int different = Integer.MIN_VALUE;
        int maxDifferent = Integer.MIN_VALUE;

        for (int i = 1; i <= nNumber; i++) {

            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 1) {
                sum1 = num1 + num2;
            } else {
                sum2 = num1 + num2;
            }

            if (sum1 != sum2 && i >= 2) {
                different = Math.abs(sum1 - sum2);
            }
            if (different >= maxDifferent) {
                maxDifferent = different;
            }

        }

        if (maxDifferent == Integer.MIN_VALUE) {
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifferent);
        }

    }
    }

