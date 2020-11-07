package PreExamBasic;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());

        int small = 0;
        int big = 0;
        int large = 0;

        double totalFood = 0;

        for (int i = 1; i <= cats ; i++) {

            double serving = Double.parseDouble(scanner.nextLine());

            if (serving >= 100 && serving < 200) {
                small ++;
                totalFood += serving;
            } else if (serving < 300 ) {
                big ++;
                totalFood += serving;
            } else if (serving < 400){
                large ++;
                totalFood += serving;
            }
        }
        System.out.printf("Group 1: %d cats.%n", small);
        System.out.printf("Group 2: %d cats.%n", big);
        System.out.printf("Group 3: %d cats.%n", large);
        System.out.printf("Price for food per day: %.2f lv.", totalFood / 1000 * 12.45);
    }
}
