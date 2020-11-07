package WhileLoopExercises;

import java.util.Scanner;

public class Books2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookTittle = scanner.nextLine();
        int sumBooks = 0;
        String checkedBooks = scanner.nextLine();

        while (!checkedBooks.equals("No More Books")) {

            if (checkedBooks.equals(bookTittle)) {
                break;
            }
            sumBooks++;
            checkedBooks = scanner.nextLine();

        }
        if (checkedBooks.equals(bookTittle)) {
            System.out.printf("You checked %d books and found it.", sumBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", sumBooks);
        }
    }
}
