package MoreNestedLoop;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= first; i++) {
            for (int j = 2; j <= second; j++) {
                for (int k = 1; k <= third; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j == 3) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        } else if (j == 5) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        } else if (j == 2) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        } else if (j == 7) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }

                }

            }

        }

    }
}
