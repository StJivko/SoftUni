    package ExamExercises;

    import java.util.Scanner;

    public class SuitcasesLoad {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double capacity = Double.parseDouble(scanner.nextLine());
            int placeTaken = 0;
            int suitcases = 0;

            while (capacity >= placeTaken) {
                String command = scanner.nextLine();
                if (command.equals("End")) {
                    break;
                }
                double space = Double.parseDouble(command);
                placeTaken += space;
                if (placeTaken > capacity) {
                    break;
                }
                suitcases ++;
            }
            if (capacity >= placeTaken) {
                System.out.println("Congratulations! All suitcases are loaded!");
            } else {
                System.out.println("No more space!");
            }
            System.out.printf("Statistic: %d suitcases loaded.", suitcases);
        }
    }
