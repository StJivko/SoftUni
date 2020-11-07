package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSide = 0;
        int rightSide = 0;

        for (int i = 1; i <= n; i ++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            leftSide += num1;

        }
        for (int i = 1; i <= n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            rightSide += num2;
        }
        if (leftSide == rightSide ) {
            System.out.printf("Yes, sum = %d", rightSide);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSide - rightSide));
        }
    }
}
