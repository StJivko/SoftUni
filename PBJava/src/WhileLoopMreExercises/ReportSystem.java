package WhileLoopMreExercises;

import java.util.Scanner;


    public class ReportSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int moneyNeeded = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();
            int paymentCount = 0;
            int cashPayment = 0;
            int cardPayment = 0;
            int cashMoney = 0;
            int cardMoney = 0;
            int moneyCollected = 0;


            while (!command.equals("End")) {
                int money = Integer.parseInt(command);
                paymentCount ++;

                if (paymentCount % 2 == 1) {

                    if (money > 100) {
                        System.out.println("Error in transaction!");
                    } else {
                        cashPayment ++;
                        cashMoney += money;
                        moneyCollected += money;
                        System.out.println("Product sold!");
                    }
                } else if (paymentCount % 2 == 0) {

                    if (money < 10) {
                        System.out.println("Error in transaction!");
                    } else {
                        cardPayment ++;
                        cardMoney += money;
                        moneyCollected += money;
                        System.out.println("Product sold!");
                    }
                } if (moneyCollected >= moneyNeeded) {
                    break;
                }
                command = scanner.nextLine();
            }

            if (moneyCollected >= moneyNeeded) {
                System.out.printf("Average CS: %.2f%n", (double) (cashMoney) / cashPayment);
                System.out.printf("Average CC: %.2f%n", (double) (cardMoney) / cardPayment);
            } else {
                System.out.println("Failed to collect required money for charity.");
            }
        }
    }

