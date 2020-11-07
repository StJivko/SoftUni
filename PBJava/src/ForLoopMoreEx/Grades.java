package ForLoopMoreEx;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int countTotalGrades = 0;
        double sumGrades = 0.0;
        double count23 = 0.0;
        double count34 = 0.0;
        double count45 = 0.0;
        double count56 = 0.0;

        for (int i = 1; i <= students; i++) {
            double grades = Double.parseDouble(scanner.nextLine());

            if (2 <= grades && grades <= 2.99) {
                countTotalGrades++;
                sumGrades += grades;
                count23++;
            } else if (grades <= 3.99) {
                countTotalGrades++;
                sumGrades += grades;
                count34++;
            } else if (grades <= 4.99) {
                countTotalGrades++;
                sumGrades += grades;
                count45++;
            } else {
                countTotalGrades++;
                sumGrades += grades;
                count56++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", count56/countTotalGrades * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", count45/countTotalGrades * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", count34/countTotalGrades * 100);
        System.out.printf("Fail: %.2f%%\n", count23/countTotalGrades * 100);
        System.out.printf("Average: %.2f", sumGrades/students);
    }
}
