package ExamExercises;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int food = Integer.parseInt(scanner.nextLine()) * 1000;

         int eaten = 0;

         while (eaten < 1000000000) {
             String serving = scanner.nextLine();
             if (serving.equals("Adopted")){
                 break;
             }
             int lunch = Integer.parseInt(serving);

             eaten += lunch;

         }if (food >= eaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", food - eaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eaten - food);
        }
    }
}
