package ForLoopLab;

import java.util.Scanner;

public class TestEqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int different = Integer.MIN_VALUE;
        int maxDiff = 0;

        for (int i = 1; i <= n; i ++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 1) {
                sum1 = num1 + num2;
            } else {
                sum2 = num1 + num2;
            }

            if (sum1 != sum2 && i >=2) {
                different = Math.abs(sum1 - sum2);
            }
            if (different >= maxDiff) {
                maxDiff = different;
            }
        }
    }
}
