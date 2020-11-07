package PreExamBasic;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        •	Цена за отпечатване на една страница - реално число в интервала (0.00…1.50]
//•	Цена за отпечатване на една корица - реално число в интервала (0.00…5.00]
//•	Процентно намаление за отпечатване на хартия - цяло число в интервала (0…100]
//•	Сумата, която трябва да се заплати на дизайнер - реално число в интервала (0.00…150.00]
//•	Процент от цялата дължима сума, който е заплатен от екипа - цяло число в интервала [0…100]

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double moneyForDesigner = Double.parseDouble(scanner.nextLine());
        int percentPaidFromCrew = Integer.parseInt(scanner.nextLine());

        int pages = 899;
        int covers = 2;

        double priceForPages = pricePerPage * pages;
        double priceForCovers = pricePerCover * covers;
        double priceForPaper = (priceForCovers + priceForPages);
        double disForPaper = priceForPaper - ((double)discount / 100 * priceForPaper);
        double moneyForBookAndDesigner = disForPaper + moneyForDesigner;
        double totalMoney = moneyForBookAndDesigner - ((double)percentPaidFromCrew / 100 * moneyForBookAndDesigner);

        System.out.printf("Avtonom should pay %.2f BGN.", totalMoney);

    }
}
