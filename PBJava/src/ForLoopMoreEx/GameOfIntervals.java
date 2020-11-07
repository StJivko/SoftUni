    package ForLoopMoreEx;

    import java.util.Scanner;

    public class GameOfIntervals {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int turns = Integer.parseInt(scanner.nextLine());
            double sumPoints = 0;
            int countNum = 0;
            int count09 = 0;
            int count1019 = 0;
            int count2029 = 0;
            int count3039 = 0;
            int count4050 = 0;
            int countNevalid = 0;


            for (int i = 1; i <= turns; i++) {
                double points = Double.parseDouble(scanner.nextLine());

                if (points >= 0 && points <= 9) {
                    sumPoints+= 20 * points / 100;
                    countNum ++;
                    count09 ++;
                } else if (0 < points && points <= 19) {
                    sumPoints += 30 * points / 100;
                    countNum ++;
                    count1019++;
                } else if (0 < points && points <= 29) {
                    sumPoints += 40 * points / 100;
                    countNum ++;
                    count2029++;
                } else if (0 < points && points <= 39) {
                    sumPoints += 50;
                    countNum ++;
                    count3039++;
                } else if (0 < points && points <= 50) {
                    sumPoints += 100;
                    countNum ++;
                    count4050++;
                } else if (points < 0 || points > 50) {
                    sumPoints /= 2;
                    countNum ++;
                    countNevalid++;
                }
            }
            System.out.printf("%.2f\n",sumPoints);
            System.out.printf("From 0 to 9: %.2f%%\n", (double)count09/countNum * 100);
            System.out.printf("From 10 to 19: %.2f%%\n", (double)count1019/countNum * 100);
            System.out.printf("From 20 to 29: %.2f%%\n", (double)count2029/countNum * 100);
            System.out.printf("From 30 to 39: %.2f%%\n", (double)count3039/countNum * 100);
            System.out.printf("From 40 to 50: %.2f%%\n", (double)count4050/countNum * 100);
            System.out.printf("Invalid numbers: %.2f%%", (double)countNevalid/countNum * 100);
        }
    }
