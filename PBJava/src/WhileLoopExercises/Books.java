package WhileLoopExercises;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookTittle = scanner.nextLine();
        int sumBooks = 0;
        String checkedBooks = "";

        while (!bookTittle.equals("No More Books")) {
            checkedBooks = scanner.nextLine();

            if (checkedBooks.equals(bookTittle) || checkedBooks.equals("No More Books")) {
                break;
            }
            sumBooks++;

        }
        if (checkedBooks.equals(bookTittle)) {
            System.out.printf("You checked %d books and found it.", sumBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", sumBooks);
        }
    }
}