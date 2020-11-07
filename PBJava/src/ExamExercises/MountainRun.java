package ExamExercises;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
//        2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
//        3. Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double time = distanceInMeters * timePerMeter;
        double penalty = (Math.floor(distanceInMeters / 50 )) * 30;
        double newTime = time + penalty;


        if (newTime < recordInSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", newTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", newTime - recordInSec);
        }

    }
}
