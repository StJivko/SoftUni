package ForLoopLab;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nAges = Integer.parseInt(scanner.nextLine());
       double xLaundy = Double.parseDouble(scanner.nextLine());
       int pToysPrice = Integer.parseInt(scanner.nextLine());

        int sumToys = 0 ;
        int sumMoney = 0;

        for (int i = 1; i <= nAges; i ++) {

            if (i%2 != 0) {
                sumToys += 1;
            } if (i%2 == 0) {
                sumMoney += ((i*10)/2) - 1;
            }
        }
        double moneyFromToys = sumToys * pToysPrice;
        double totalMoney = moneyFromToys + sumMoney;

        if (totalMoney >= xLaundy) {
            System.out.printf("Yes! %.2f", (totalMoney - xLaundy));
        } else {
            System.out.printf("No! %.2f", (xLaundy - totalMoney));
        }

//            int sumMoney = 0;
//        for (int i = 1; i <= 10; i ++) {
//            if(i%2 == 0) {
//                sumMoney += i*10;
//                System.out.println(sumMoney);
//            }
//        }




    }
}

