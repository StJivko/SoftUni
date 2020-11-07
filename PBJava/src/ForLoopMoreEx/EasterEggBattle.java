package ForLoopMoreEx;

import java.util.Scanner;

public class EasterEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1Eggs = Integer.parseInt(scanner.nextLine());
        int player2Eggs = Integer.parseInt(scanner.nextLine());
        int eggs = player1Eggs + player2Eggs;

        for (int i = 1; i <= eggs ; i++) {
            String command = scanner.nextLine();

            if (command.equals("one")) {
                player2Eggs -= 1;
                if (player2Eggs < 1) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1Eggs);
                    break;
                }
            } else if (command.equals("two")) {
                player1Eggs -= 1;
                if (player1Eggs < 1) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2Eggs);
                    break;
                }

            } else if (command.equals("End of battle")) {
                System.out.printf("Player one has %d eggs left.%n", player1Eggs);
                System.out.printf("Player two has %d eggs left.%n", player2Eggs);
                break;
            }
        }

    }
}
