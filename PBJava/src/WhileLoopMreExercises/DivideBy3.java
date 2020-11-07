package WhileLoopMreExercises;

import java.util.Scanner;

public class DivideBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i <= 100) {
            i ++;
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
