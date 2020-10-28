package Conditionals;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Вход:
//        •	Първи ред: число за преобразуване - реално число
//•	Втори ред: входна мерна единица - текст
//•	Трети ред: изходна мерна единица (за резултата) - текст
        double number = Double.parseDouble(scanner.nextLine());
        String entry = scanner.nextLine();
        String exit = scanner.nextLine();

        if (entry.equals("mm") && exit.equals("cm")) {
            number = number / 10;
        } else if (entry.equals("mm") && exit.equals("m")) {
            number = number / 1000;
        } else if (entry.equals("cm") && exit.equals("mm")) {
            number = number * 10;
        } else if (entry.equals("cm") && exit.equals("m")) {
            number = number / 100;
        } else if (entry.equals("m") && exit.equals("cm")) {
            number = number * 100;
        } else if ((entry.equals("m") && exit.equals("mm"))) {
            number = number * 1000;
        }
        System.out.printf("%.3f", number);
    }
}
