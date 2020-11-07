package NestedLoopExercises;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int rows = 1; rows <= n; rows ++) {
            for (int cols = 1; cols <= rows ; cols++) {
                counter ++;
                System.out.print(counter + " ");
                if (counter >= n) {
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
