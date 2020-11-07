package NestedLoopLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= 10; x++) {
                int product = i * x;
                System.out.printf("%d * %d = %d%n",i ,x ,product);
            }
        }
    }
}
