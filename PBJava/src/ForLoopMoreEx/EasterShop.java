package ForLoopMoreEx;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOnStock = Integer.parseInt(scanner.nextLine());
        int soldEggs = 0;
        String command = "";

        for (int i = 1; i <= eggsOnStock ; i++) {
            command = scanner.nextLine();
            if (command.equals("Close")) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (eggsOnStock < quantity){
                    break;
                }
                eggsOnStock -= quantity;
                soldEggs += quantity;
            } else if (command.equals("Fill")) {
                eggsOnStock += quantity;
            }
        }
        if (command. equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsOnStock);
        }
    }
}
