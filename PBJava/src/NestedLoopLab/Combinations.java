package NestedLoopLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean flag = false;


        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    if (i + j + k == num) {
                        combinations++;
                        break;
                    }

                }

            }
        }
        System.out.println(combinations);
    }
}
