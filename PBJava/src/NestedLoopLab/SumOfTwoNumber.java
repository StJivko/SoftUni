package NestedLoopLab;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean flag = false;
        int i = 0;
        int j = 0;

        for (i = startNumber; i <= endNumber; i++) {
            for (j = startNumber; j <= endNumber; j++) {
                combination++;
                if (i + j == magicNumber) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }

        }
        if (i + j != magicNumber) {
            System.out.printf("%d combinations - neither equals magic number %d", combination, magicNumber);
        } else {
            System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNumber);

        }
    }
}