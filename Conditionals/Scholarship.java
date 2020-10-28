package Conditionals;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double scholarShipSocial = 0.35 * minSalary;
        double scholarShipExcellent = 25 * grade;

        if (profit <= minSalary && grade >= 4.5) {
            if (grade > 5.5) {
                if (scholarShipExcellent < scholarShipSocial) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarShipSocial));
                } else {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarShipExcellent));
                }
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarShipSocial));
            }
        } else if (profit > minSalary && grade >= 5.5) {

            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarShipExcellent));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
    }
