package ExamExercises;

import java.util.Scanner;

public class DivisionWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = Integer.parseInt(scanner.nextLine());

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 1; i <= count ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num %2 == 0){
                count2 ++;
            }
            if (num % 3 == 0){
                count3 ++;
            }
            if (num % 4 == 0) {
                count4 ++;
            }
        }
        System.out.printf("%.2f%%%n",(double) count2 / count * 100);
        System.out.printf("%.2f%%%n",(double) count3 / count * 100);
        System.out.printf("%.2f%%",(double) count4 / count * 100);
    }
}
