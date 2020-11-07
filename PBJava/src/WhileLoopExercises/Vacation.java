package WhileLoopExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int daysCounter = 0;

        while (moneyAvailable < moneyNeeded && spendCounter < 5) {
            String action = scanner.nextLine();
            int amount = Integer.parseInt(scanner.nextLine());
            daysCounter++;

            if (action.equals("spend")) {
                moneyAvailable -= amount;
                if (moneyAvailable < 0) {
                    moneyAvailable = 0;
                }
                spendCounter ++;
            }
            else if (action.equals("save")) {
                moneyAvailable += amount;
                spendCounter = 0;
            }
        }
        if (spendCounter == 5) {
            System.out.printf("You can't save the money.%n%d", spendCounter);
        } else if (moneyAvailable >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
