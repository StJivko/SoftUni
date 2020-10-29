package BasicsSyntax;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherDogs = Integer.parseInt(scanner.nextLine());
        double dogsFood = 2.50;
        int otherFood = 4;
        double moneyNeeded = (dogs * dogsFood) + (otherDogs * otherFood);
        System.out.println(moneyNeeded + " lv.");
    }
}
