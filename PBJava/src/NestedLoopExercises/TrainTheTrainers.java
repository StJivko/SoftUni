package NestedLoopExercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teachers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int allCountGrades = 0;
        double allSumGrades = 0;

        while (!command.equals("Finish")) {
            int countGrade = 0;
            double sumGrade = 0;

            for (int i = 1; i <= teachers; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrade++;
                sumGrade += grade;
                allCountGrades++;
                allSumGrades += grade;
            }
            double averageGradePerPresentation = sumGrade / countGrade;
            System.out.printf("%s - %.2f.%n", command, averageGradePerPresentation);
            command = scanner.nextLine();
        }
        double averageScore = allSumGrades / allCountGrades;
        System.out.printf("Student's final assessment is %.2f.", averageScore);
    }
}
