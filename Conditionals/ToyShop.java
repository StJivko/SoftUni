package Conditionals;

import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMRepeatingLeaf;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double puzzle = 2.60;
        double doll = 3.0;
        double teddyBear = 4.10;
        double minion = 8.20;
        double lorry = 2.0;
        double profit = 0.0;
        double toysPriceAfterDiscount = 0.0;
        double moneyAfterRent = 0.0;



//        Вход:
        double holidayPrice = Double.parseDouble(scanner.nextLine());

        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount  = Integer.parseInt(scanner.nextLine());
        int teddyBearCount  = Integer.parseInt(scanner.nextLine());
        int minionCount  = Integer.parseInt(scanner.nextLine());
        int lorryCount = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzleCount + dollCount + teddyBearCount + minionCount + lorryCount;
        double totalPrice= puzzle*puzzleCount + doll*dollCount + teddyBear*teddyBearCount + minion*minionCount + lorry*lorryCount;

        if (toysCount >= 50) {
            toysPriceAfterDiscount = totalPrice - (0.25*totalPrice);
            totalPrice = toysPriceAfterDiscount - (0.10 * toysPriceAfterDiscount);
        }
        else if (toysCount < 50){
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
         if (totalPrice < holidayPrice){
            profit = holidayPrice  - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", profit);

        }else if (totalPrice >= holidayPrice) {
            profit = totalPrice - holidayPrice;
            System.out.printf("Yes! %.2f lv left.", profit);
        }



    }
}
