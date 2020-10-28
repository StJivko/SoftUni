package BasicsLabExcercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
//        •	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
//        •	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
//        •	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());

        double euro = 1.94;

        double money = vegetablePrice * vegesKg + fruitsPrice * fruitsKg;
        double moneyEuro = money / euro;

        System.out.printf("%.2f", moneyEuro);

    }
}
