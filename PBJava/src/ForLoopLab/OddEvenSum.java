package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd  = 0;

        for (int i = 0; i <= n; i+=2) {
            int numEven = Integer.parseInt(scanner.nextLine());
            sumEven += numEven;
        }
        for (int i = 1; i <= n; i+=2) {
            int numOdd = Integer.parseInt(scanner.nextLine());
            sumOdd += numOdd;
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes\n" + "Sum = %d", sumEven);
        } else {
            System.out.printf("No\n" + "Diff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
