package NestedLoopExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = 1; symbol1 <= n; symbol1 ++) {
            for (int symbol2 = 1; symbol2 <=n ; symbol2++) {
                for (int symbol3 = 97; symbol3 < 97 + l; symbol3++) {
                       // char letter = (char) symbol3;
                    for (int i = 97; i < 97 + l ; i++) {
                      //  char letter2 = (char) i;
                        for (int j = 1; j <= n ; j++) {
                            if (j > symbol1 && j > symbol2) {
                                System.out.printf("%d%d%c%c%d ",symbol1,symbol2,symbol3,i, j);
                            }

                        }
                    }

                }

            }
        }
    }
}