package PreExamBasic;


import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (team.equals("Argentina")) {
            switch (souvenir){
                case "flags":
                    price = 3.25;
                    break;
                case "caps":
                    price = 7.20;
                    break;
                case "posters":
                    price = 5.10;
                    break;
                case "stickers":
                    price = 1.25;
                    break;
                default:
                    break;
            }
        }
        if (team.equals("Brazil")) {
            switch (souvenir){
                case "flags":
                    price = 4.20;
                    break;
                case "caps":
                    price = 8.50;
                    break;
                case "posters":
                    price = 5.35;
                    break;
                case "stickers":
                    price = 1.20;
                    break;
                default:
                    break;
            }
        }
        if (team.equals("Croatia")) {
            switch (souvenir){
                case "flags":
                    price = 2.75;
                    break;
                case "caps":
                    price = 6.90;
                    break;
                case "posters":
                    price = 4.95;
                    break;
                case "stickers":
                    price = 1.10;
                    break;
                default:
                   break;
            }
        }
        if (team.equals("Denmark")) {
            switch (souvenir){
                case "flags":
                    price = 3.10;
                    break;
                case "caps":
                    price = 6.50;
                    break;
                case "posters":
                    price = 4.80;
                    break;
                case "stickers":
                    price = 0.90;
                    break;
                default:
                    break;
            }
        }   double totalPrice = num * price;
        if (!souvenir.equals("caps")&& !souvenir.equals("posters") && !souvenir.equals("stickers") && !souvenir.equals("flags")) {
            System.out.println("Invalid stock!");
        } else if (!team.equals("Argentina")&& !team.equals("Brazil") && !team.equals("Croatia") && !team.equals("Denmark")){
            System.out.println("Invalid country!");
        }else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.",num, souvenir, team, totalPrice );
        }


    }
}