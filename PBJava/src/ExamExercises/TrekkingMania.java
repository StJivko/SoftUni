package ExamExercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups ; i++) {

            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                monblan += people;
            } else if (people <= 25) {
                kilimandjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }
        System.out.printf("%.2f%%%n",(double) musala / totalPeople * 100);
        System.out.printf("%.2f%%%n",(double) monblan / totalPeople * 100);
        System.out.printf("%.2f%%%n",(double) kilimandjaro / totalPeople * 100);
        System.out.printf("%.2f%%%n",(double) k2 / totalPeople * 100);
        System.out.printf("%.2f%%",(double) everest / totalPeople * 100);
    }
}
