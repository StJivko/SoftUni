package ExamExercises;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        int eatenByDog = 0;
        int eatenByCat = 0;
        double cookies = 0;


        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            double eatenForDay = catFood + dogFood;

            if (i % 3 == 0) {
                cookies +=  (eatenForDay * 10 /100);
            }
            eatenByDog += dogFood;
            eatenByCat += catFood;


        }
        double foodEaten = eatenByCat + eatenByDog;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",cookies);
        System.out.printf("%.2f%% of the food has been eaten.%n", foodEaten / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", eatenByDog / foodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.", eatenByCat / foodEaten * 100);
    }
}