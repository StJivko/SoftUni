package WhileLoop;

import java.util.Scanner;

public class Graduate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < minNum) {
                minNum = number;
            }
            input = scanner.nextLine();

        }
        System.out.println(minNum);

    }

    public static class Graduated {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String student = scanner.nextLine();
            double sumGrades = 0.0;

            int grade = 1;

            while (grade <= 12) {
                double currentGrade = Double.parseDouble(scanner.nextLine());

                if (currentGrade < 4 ) {

                    break;
                }
                sumGrades += currentGrade;
                grade++;

            } if (grade < 12) {
            System.out.printf("%s has been excluded at %d grade",student, grade);}
            else {
                System.out.printf("%s graduated. Average grade: %.2f", student, sumGrades / 12);
            }
        }
    }
}
