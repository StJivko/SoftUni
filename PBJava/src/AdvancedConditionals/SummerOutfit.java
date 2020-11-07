package AdvancedConditionals;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();


        switch (when) {
            case "Morning":
                if (celsius >= 10 && celsius <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Sweatshirt", "Sneakers");
                } else if (celsius > 18 && celsius <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Shirt", "Moccasins");
                } else if (celsius >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                        "T-Shirt", "Sandals");
                } break;
            case "Afternoon":
                if (celsius >= 10 && celsius <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Shirt", "Moccasins");
                } else if (celsius > 18 && celsius <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "T-Shirt", "Sandals");
                } else if (celsius >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Swim Suit", "Barefoot");
                } break;
            case "Evening":
                if (celsius >= 10 && celsius <= 18) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Shirt", "Moccasins");
                } else if (celsius > 18 && celsius <= 24) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Shirt", "Moccasins");
                } else if (celsius >= 25) {
                    System.out.printf("It's %d degrees, get your %s and %s.", celsius,
                            "Shirt", "Moccasins");
                }
        }
    }
}
