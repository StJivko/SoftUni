package NestedLoopLab;

import java.io.PrintStream;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int takenSeats = 0;
        int totalTickets = 0;
        int student =0;
        int standard = 0;
        int kids = 0;


        while (!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(scanner.nextLine());
            while (takenSeats < seats) {

                String ticket = scanner.nextLine();
                if  (ticket.equals("student")){
                    student ++;
                    totalTickets ++;
                }
                else if (ticket.equals("standard")){
                    standard ++;
                    totalTickets ++;
                }
                else if (ticket.equals("kid")) {
                    kids ++;
                    totalTickets ++;
                }
                if (ticket.equals("End")) {
                    break;
                }
                takenSeats ++;
            }
            double percentage = 1.0 * takenSeats / seats;
            takenSeats = 0;
            System.out.printf("%s - %.2f%% full.%n",movie, percentage * 100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kids / totalTickets * 100);

    }
}
