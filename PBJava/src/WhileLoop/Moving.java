package WhileLoop;


import java.util.Scanner;

public class   Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width * length * height;
        String text = scanner.nextLine();
        int sumBoxes = 0;

        while (!text.equals("Done")) {
        int boxes = Integer.parseInt(text);
        sumBoxes += boxes;

        if (sumBoxes > volume) {
            break;
        }
        text = scanner.nextLine();
        }
        if (volume >= sumBoxes) {
            System.out.printf("%d Cubic meters left.", volume - sumBoxes);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", sumBoxes - volume);
        }

    }
}

