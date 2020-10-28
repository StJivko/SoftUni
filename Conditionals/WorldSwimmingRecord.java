package Conditionals;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double metersPerSecond = Double.parseDouble(scanner.nextLine());

        double addTime = Math.floor(distance / 15);
        double resistance = (addTime * 12.5);
        double totalTime = (distance * metersPerSecond) + resistance;
        double difference = Math.abs(totalTime - record);



        if (record > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", (totalTime) );
        } else if (record <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }

    }
}
