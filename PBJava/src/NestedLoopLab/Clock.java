package NestedLoopLab;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i <= 23; i ++) {
            for (int min = 0; min <= 59; min ++ ) {
                System.out.printf("%d:%d%n", i, min);
            }
        }
    }
}
