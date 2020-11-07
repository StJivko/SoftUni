package AdvancedConditionals;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile");
                break;
            case "cat":
                System.out.println("unknown");
                break;
        }
    }
}
