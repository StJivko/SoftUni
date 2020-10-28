package BasicsLabExcercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double widthCm = w * 100;
        double heightCm = h * 100;

        double deskRow = ((int)heightCm - 100) / 70;
        double rows = (int)widthCm / 120;

        double result = deskRow * rows - 3;

        System.out.printf("%.0f", result);









        
    }
}
