package ForLoopMoreEx;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakes = Integer.parseInt(scanner.nextLine());


        double sugarNeeded = 0;
        double wheyNeeded = 0;
        int maxSugar = 0;
        int maxWhey = 0;

        for (int i = 1; i <= cakes ; i++) {

            int sugarUsed = Integer.parseInt(scanner.nextLine());
            int wheyUsed = Integer.parseInt(scanner.nextLine());
            if (sugarUsed > maxSugar){
                maxSugar = sugarUsed;
            }
            if (wheyUsed > maxWhey) {
                maxWhey = wheyUsed;
            }

            sugarNeeded += sugarUsed;
            wheyNeeded += wheyUsed;

        }double sugarPacket = Math.ceil(sugarNeeded / 950);
        double wheyPacket = Math.ceil(wheyNeeded/ 750);
        System.out.printf("Sugar: %.0f%n", sugarPacket);
        System.out.printf("Flour: %.0f%n", wheyPacket);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxWhey, maxSugar);

    }
}
