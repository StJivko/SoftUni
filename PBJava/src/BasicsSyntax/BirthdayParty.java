package BasicsSyntax;

import java.util.Scanner;


    public class BirthdayParty {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rent = Integer.parseInt(scanner.nextLine());

            double cake = rent * 20 / 100;
            double drinks = cake - (cake * 45 / 100);
            double anime = rent / 3;
            double budget = rent + cake + drinks + anime;

            System.out.print(budget);
        }
    }