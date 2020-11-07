package WhileLoopExercises;

import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int spendCounter = 0;
        int daysCounter = 0;

        while (money < holidayMoney && spendCounter < 5) {
            daysCounter ++;
            String action = scanner.nextLine();
            double moneyAction = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                spendCounter ++;
                money -= moneyAction;
                if (money < 0) {
                    money = 0;
                }
            } else if (action.equals("save")) {
                spendCounter = 0;
                money += moneyAction;
            }
            if (spendCounter == 5) {
                break;
            }
        } if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCounter);
        } else {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
