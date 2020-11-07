package WhileLoopMreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = "";
        int countC = 0;
        int countO = 0;
        int countN = 0;

        while (!symbol.equals("End")) {
            symbol = scanner.nextLine();
            char letter = symbol.charAt(0);
           if (letter == 'c') {
               countC++;
           } else if (letter == 'o') {
               countO ++;
           } else if (letter == 'n') {
               countN ++;
           }
        }

    }
}
