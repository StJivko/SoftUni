package ForLoopMoreEx;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int sumFans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= sumFans; i++ ) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", (double)sectorA/sumFans * 100);
        System.out.printf("%.2f%%\n", (double)sectorB/sumFans * 100);
        System.out.printf("%.2f%%\n", (double)sectorV/sumFans * 100);
        System.out.printf("%.2f%%\n", (double)sectorG/sumFans * 100);
        System.out.printf("%.2f%%", (double)sumFans/stadiumCapacity* 100);


    }
}
