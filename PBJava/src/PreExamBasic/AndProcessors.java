package PreExamBasic;

import java.util.Scanner;

public class AndProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int processors = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int workingHours = employees * workingDays * 8;
        double processorsMade = Math.floor((double) workingHours / 3);

        if (processors > processorsMade) {
            double diff = processors - processorsMade;
            double moneyMade = diff * 110.10;
            System.out.printf("Losses: -> %.2f BGN", moneyMade);
        }
        else {
            double diff = processors - processorsMade;
            double moneyMade = diff * 110.10;
            System.out.printf("Profit: -> %.2f BGN",Math.abs (moneyMade));
        }
    }
}
