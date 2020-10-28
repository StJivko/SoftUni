package AdvancedConditionals;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int people = r*c;
        double money = 0.0;

        switch (typeProjection) {
            case "Premiere":
                money = people * 12;
                break;
            case "Normal":
                money = people * 7.5;
                break;
            case "Discount":
                money = people * 5.00;
                break;
        }
        System.out.printf("%.2f leva", money);
    }
}
