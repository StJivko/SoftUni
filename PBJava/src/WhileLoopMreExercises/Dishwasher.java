package WhileLoopMreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String action = scanner.nextLine();
        int mlAlcohol = bottles * 750;
        int load = 0;
        int plates = 0;
        int pots =0;

        while (!action.equals("End")) {
            int dishes = Integer.parseInt(action);
            load++;
            if (load == 3) {
                mlAlcohol -= dishes * 15;
                load = 0;
                pots += dishes;
            } else {
                mlAlcohol -= dishes * 5;
                plates += dishes;
            }
            if (mlAlcohol < 0) {
                break;
            }
            action = scanner.nextLine();
        }
        if (mlAlcohol < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(mlAlcohol));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", mlAlcohol);
        }
    }
}
