package ForLoopMoreEx;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        int waterBill = 20 * months;
        int netBill = 15 * months;
        double electricityBill = 0.0;

        for (int i =1; i <= months; i ++) {
            double elBill = Double.parseDouble(scanner.nextLine());
            electricityBill += elBill;

        }
        double sumBills = waterBill + netBill + electricityBill;
        double otherBills =  sumBills + (0.20 * sumBills);
        System.out.printf("Electricity: %.2f lv\n", electricityBill);
        System.out.printf("Water: %.2f lv\n", (double)waterBill);
        System.out.printf("Internet: %.2f lv\n", (double)netBill);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv", (waterBill + netBill + electricityBill + otherBills)/months);

    }
}
