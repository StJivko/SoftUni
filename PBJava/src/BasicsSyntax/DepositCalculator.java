package BasicsSyntax;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depSum = Double.parseDouble(scanner.nextLine());
        double depDate = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double credit = (depSum * (interestRate/100));
        double rateMonth = credit / 12;
        Double sum = depSum + (depDate * rateMonth);
        System.out.printf("%.2f", sum);


    }
}
