package Conditionals;

import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hourInMin = hour * 60;
        int restMin = min % 60;
        int totalTimeInMin = hourInMin + restMin;
        int timeAfter15inMin = totalTimeInMin + 15;
        int newTimeHours = timeAfter15inMin / 60;
        int newTimeMin = timeAfter15inMin % 60;

        if (newTimeHours == 24){
            newTimeHours = 0;
        }
        if (newTimeMin < 10){
            System.out.printf("%d:0%d",newTimeHours,newTimeMin);
        } else{
            System.out.printf("%d:%d",newTimeHours,newTimeMin);
        }





    }
}
