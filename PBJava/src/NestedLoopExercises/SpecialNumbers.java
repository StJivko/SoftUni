package NestedLoopExercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        // цифрата на хилядите
        for (int i = 1; i <= 9; i++) {
            // цифрата на стотиците
            for (int j = 1; j <= 9; j++) {
                // цифрата на десетиците
                for (int k = 1; k <= 9; k++) {
                    // цифрата на десетиците
                    for (int l = 1; l <= 9; l++) {
                        if (num % i == 0 && num % j == 0 && num % k == 0 && num % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j , k, l);
                        }
                    }
                }
            }
        }
    }
}
