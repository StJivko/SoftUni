package ExamExercises;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseCount = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100;

        double bitCoinInBgn = bitcoin * 1168;
        double chineseInDollar = chineseCount * 0.15;
        double chineseInBGN = chineseInDollar * 1.76;
        double totalEuro = (bitCoinInBgn + chineseInBGN) / 1.95;
        double totalEuroComm = totalEuro - (totalEuro * commission);
        System.out.printf("%.2f", totalEuroComm);

    }
}
