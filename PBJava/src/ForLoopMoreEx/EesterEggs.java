package ForLoopMoreEx;

import java.util.Scanner;

public class EesterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max;
        String color = "";
        boolean flag = false;

        for (int i = 1; i <= eggs ; i++) {
            color = scanner.nextLine();

            switch (color) {
                case "red":
                    red ++;
                    break;
                case "orange":
                    orange ++;
                    break;
                case "blue":
                    blue ++;
                    break;
                case "green":
                    green ++;
                    break;
            }
        }
        if (red > orange && red > blue && red > green) {
            max = red;

            color = "red";
        } else if (orange > red && orange > blue && orange > green) {
            max = orange;

            color= "orange";
        } else if (blue > red && blue > orange && blue > green) {
            max = blue;

            color= "blue";
        } else  {
            max = green;

            color="green";
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", max,color);
    }
}
