package WhileLoopMreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int countInput = 0;
        double plus = 0.0;

        while (numbers != countInput) {
            int input = Integer.parseInt(scanner.nextLine());
            countInput ++;
            plus += input;

        }
        System.out.printf("%.2f",plus / numbers);
    }
}
