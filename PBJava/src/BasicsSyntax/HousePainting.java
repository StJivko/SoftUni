package BasicsSyntax;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	x – височината на къщата – реално число в интервала [2...100]
//        2.	y – дължината на страничната стена – реално число в интервала [2...100]
//        3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double greenPaint = 3.4;
        double redPaint = 4.3;

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
//        •	Предната и задната стена са квадрати със страна „x“
//        o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        double frontBackWalls = (x*x)*2 - (1.2*2.0);
//       •	Страничните стени са правоъгълници със страни „x“ и „y“
//        o	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        double sideWalls = (x*y)*2 - (1.5*1.5)*2.0;
//        Покривът има следните размери:
//•	Два правоъгълника със страни „x“ и „y“
//•	Два равностранни триъгълника със страна „x“ и височина „h“
        double roofPrav = ((x * y) * 2.0);
        double roofTrianglen = (x * h / 2.0) * 2;

        double green = (frontBackWalls + sideWalls) / greenPaint;
        double red = (roofPrav + roofTrianglen) / redPaint;

        System.out.printf("%.2f", green);
        System.out.println();
        System.out.printf("%.2f", red);






    }
}
