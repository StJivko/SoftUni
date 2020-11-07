package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i ++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }

        }
        System.out.printf("%.2f%%\n", 1.00 * p1 / n * 100);
        System.out.printf("%.2f%%\n", 1.00 * p2 / n * 100);
        System.out.printf("%.2f%%\n", 1.00 * p3 / n * 100);
        System.out.printf("%.2f%%\n", 1.00 * p4 / n * 100);
        System.out.printf("%.2f%%\n", 1.00 * p5 / n * 100);
    }
}
