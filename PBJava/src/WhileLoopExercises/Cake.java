package WhileLoopExercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int pieces = width * length;
        int countPieces = 0;
        int takenPieces = 0;
        String action = "";

        while (pieces >= 0) {
            action = scanner.nextLine();

            if (action.equals("STOP")) {
                break;
            }

            int take = Integer.parseInt(action);
            pieces -= take;
            countPieces += take;


        }
        if (action.equals("STOP")) {
            System.out.printf("%d pieces are left.", pieces);
        } else if (pieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }

    }
}
