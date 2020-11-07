    package ExamExercises;

    import java.util.Scanner;

    public class TouristShop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            int count = 0;
            double moneySpent = 0;


            for (int i = 1; i <= budget; i++) {
                String product = scanner.nextLine();
                if (product.equals("Stop")) {
                    System.out.printf("You bought %d products for %.2f leva.", count, moneySpent);
                    break;
                }
                double price = Double.parseDouble(scanner.nextLine());
                if (i % 3 == 0) {
                    price -= (price / 2);
                }
                moneySpent += price;
                count++;
                if (moneySpent > budget) {
                    System.out.println("You don't have enough money!");
                    System.out.printf("You need %.2f leva!", moneySpent - budget);
                    break;
                }

            }
        }
    }
