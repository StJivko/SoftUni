package ForLoopLab;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCargos = Integer.parseInt(scanner.nextLine());
        double priceBus = 0.0;
        double priceTruck = 0.0;
        double priceTrain = 0.0;
        double sumTons = 0;
        double busTons =0;
        double truckTons = 0;
        double trainTons = 0;

        for (int i = 1; i <= countCargos; i++){
            int tons = Integer.parseInt(scanner.nextLine());
            sumTons += tons;

            if (tons <= 3) {
                priceBus += tons * 200;
                busTons += tons;
            } else if (tons <= 11) {
                priceTruck += tons * 175;
                truckTons += tons;

            } else {
                priceTrain += tons *120;
                trainTons += tons;

            }
        } double averagePricePeerTon = (priceBus + priceTrain + priceTruck) / sumTons;
        System.out.printf("%.2f\n", averagePricePeerTon);
        System.out.printf("%.2f%%\n", busTons/sumTons * 100);
        System.out.printf("%.2f%%\n",  truckTons/ sumTons * 100);
        System.out.printf("%.2f%%", trainTons / sumTons * 100);

    }
}
