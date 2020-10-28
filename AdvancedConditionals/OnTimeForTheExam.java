package AdvancedConditionals;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examStartsHour = Integer.parseInt(scanner.nextLine());
        int examStartsMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examHourInMin = (examStartsHour * 60) + examStartsMin;
        int arrivalHourInMin = (arrivalHour * 60) + arrivalMin;
        int restArrivalMin = arrivalHourInMin % 60;


        if (examHourInMin < arrivalHourInMin) {
            if (arrivalHourInMin - examHourInMin < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", arrivalHourInMin - examHourInMin);
            } else if (arrivalHourInMin - examHourInMin >= 60) {
                if (restArrivalMin < 10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d hours after the start", (arrivalHourInMin - examHourInMin) / 60, restArrivalMin);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", (arrivalHourInMin - examHourInMin) / 60, restArrivalMin);
                }
            }

        }else if (examHourInMin - arrivalHourInMin <= 30) {
            if (examHourInMin - arrivalHourInMin > 0) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", (examHourInMin - arrivalHourInMin));
            } else {
                System.out.println("On time");
            }
        } else if (examHourInMin - arrivalHourInMin >= 60){
            if ((examHourInMin - arrivalHourInMin)% 60 < 10) {
                System.out.println("Early");
                System.out.printf("%d:0%d hours before the start",(examHourInMin - arrivalHourInMin)/60,(examHourInMin - arrivalHourInMin)% 60 );
            } else {
                System.out.println("Early");
                System.out.printf("%d:%d hours before the start",(examHourInMin - arrivalHourInMin)/60,(examHourInMin - arrivalHourInMin)%60 );
            }
        } else if (examHourInMin - arrivalHourInMin > 30 && examHourInMin - arrivalHourInMin < 60) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", examHourInMin - arrivalHourInMin);
        }
    }
}