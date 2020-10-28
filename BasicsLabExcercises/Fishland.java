package BasicsLabExcercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
//•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
//•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
//•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
//•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]

        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumriq + (priceSkumriq * 0.60);
        double priceSafrid = priceCaca + (priceCaca * 0.80);
        double priceMidi = 7.50;

        double totalSum = pricePalamud * kgPalamud + priceSafrid * kgSafrid + kgMidi * priceMidi;
        System.out.printf("%.2f",totalSum);



    }
}
