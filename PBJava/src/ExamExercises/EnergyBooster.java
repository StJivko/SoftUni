    package ExamExercises;

    import java.util.Scanner;

    public class EnergyBooster {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String fruit = scanner.nextLine();
            String size = scanner.nextLine();
            int count = Integer.parseInt(scanner.nextLine());

            double price = 0.0;
            int stacks = 0;
            double priceWater = 0;
            double priceMango = 0;
            double pricePine = 0;
            double priceRasp = 0;

            if (size.equals("small")) {
                stacks = 2;
                priceWater = 52;
                priceMango = 36.66;
                pricePine = 42.10;
                priceRasp = 20.00;

            }
            if (size.equals("big")) {
                stacks = 5;
                priceWater = 28.70;
                priceMango = 19.60;
                pricePine = 24.80;
                priceRasp = 15.20;

            }
            if (fruit.equals("Watermelon")) {
                price = priceWater * stacks;
            } else if (fruit.equals("Mango")) {
                price = priceMango * stacks;
            } else if (fruit.equals("Pineapple")) {
                price = pricePine * stacks;
            } else if (fruit.equals("Raspberry")) {
                price = priceRasp * stacks;
            }
    //        switch (fruit) {
    //            case "Watermelon":
    //                price = priceWater * stacks;
    //                break;
    //            case "Mango":
    //                price = priceMango * stacks;
    //                break;
    //            case "Pineapple":
    //                price = pricePine * stacks;
    //                break;
    //            case "Raspberry":
    //                price = priceRasp * stacks;


            double totalPrice = price * count;

            if (totalPrice < 400) {
                System.out.printf("%.2f lv.", totalPrice);
            } else if (totalPrice >= 400 && totalPrice <= 1000) {
                System.out.printf("%.2f lv.", totalPrice - (totalPrice * 15 / 100));
            } else {
                System.out.printf("%.2f lv.", totalPrice - (totalPrice * 50 / 100));

            }

        }
    }
