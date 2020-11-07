package ExamExercises;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double moneyForWin = 0;
        int winGames = 0;
        int lostGames = 0;

        for (int i = 1; i <= days ; i++) {
            String command = scanner.nextLine();
            int winCurrentGame = 0;
            int lostCurrentGame = 0;
            double moneyCurrentDay = 0;

            while (!command.equals("Finish")) {
                if (!command.equals("win") && !command.equals("lose")){
                    command = scanner.nextLine();
                    continue;
                }
                if (command.equals("win")){
                    winCurrentGame ++;
                    winGames ++;
                   // moneyForWin += 20;
                    moneyCurrentDay += 20;
                } else if (command.equals("lose")) {
                    lostCurrentGame ++;
                    lostGames ++;
                }
                command = scanner.nextLine();
            }
            if (winCurrentGame > lostCurrentGame) {
                moneyForWin +=  moneyCurrentDay  + (0.1 * moneyCurrentDay);
            } else {
                moneyForWin += moneyCurrentDay;
            }

        }if (winGames > lostGames ) {
            moneyForWin = moneyForWin + (0.2 * moneyForWin);
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyForWin);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyForWin);
        }



    }
}
