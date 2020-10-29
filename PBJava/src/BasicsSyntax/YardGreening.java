package BasicsSyntax;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 7.61;
        double offer = 0.18;
        double kvm = Double.parseDouble(scanner.nextLine());
        double discount = (kvm * 7.61) * offer;
        double finalPrice = (price * kvm) - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.printf("The discount is: " + discount + " lv.");

    }
}
