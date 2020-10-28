package BasicsLabExcercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*•	цената на малините е с 50% по-ниска от тази на ягодите;
•	цената на портокалите е с 40% по-ниска от цената на малините;
•	цената на бананите е с 80% по-ниска от цената на малините.
*/

        double strawPrice = Double.parseDouble(scanner.nextLine());
        double bananasCount = Double.parseDouble(scanner.nextLine());
        double orangesCount = Double.parseDouble(scanner.nextLine());
        double raspberriesCount = Double.parseDouble(scanner.nextLine());
        double strawberriesCount = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = (strawPrice - (strawPrice / 2));
        double orangesPrice = (raspberriesPrice - (0.4 * raspberriesPrice));
        double bananasPrice = (raspberriesPrice - (0.8 * raspberriesPrice));

        double totalMoney = (raspberriesPrice * raspberriesCount) + (orangesPrice * orangesCount) + (bananasPrice * bananasCount) + (strawPrice * strawberriesCount);
        System.out.printf("%.2f", totalMoney);

    }
}
