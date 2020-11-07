package WhileLoopExercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        int sumGrade = 0;
        int countTotalGrades = 0;
        int countBadGrades = 0;
        int problems = 0;
        String lastProblem = "";

        while (countBadGrades <= badGrades) {
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                countBadGrades ++;
                if (countBadGrades >= badGrades) {
                    break;
                }
            }
            sumGrade += grade;
            countTotalGrades ++;
            problems ++;
            lastProblem = problemName;

        }
        if (countBadGrades >= badGrades) {
            System.out.printf("You need a break, %d poor grades.%n", countBadGrades);
        }else {
            System.out.printf("Average score: %.2f%n",(double) sumGrade/countTotalGrades);
            System.out.printf("Number of problems: %d%n", problems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
