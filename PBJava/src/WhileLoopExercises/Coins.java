package WhileLoopExercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coinsSum = 0;
        change = Math.floor(change * 100);

        while (change > 0) {

            if (change >= 200) {
                change -= 200;
                coinsSum++;
            } else if (change >= 100) {
                change -= 100;
                coinsSum++;
            } else if (change >= 50) {
                change -= 50;
                coinsSum ++;
            } else if (change >= 20) {
                change -= 20;
                coinsSum ++;
            } else if (change >= 10) {
                change -= 10;
                coinsSum ++;
            } else if (change >= 5) {
                change -= 5;
                coinsSum ++;
            } else if (change >= 2) {
                change -= 2;
                coinsSum++;
            } else if (change >=1) {
                change -= 1;
                coinsSum ++;
            }

        }
        System.out.println(coinsSum);


    }
}
