package ExamExercises;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        На първия ред - минути разходка на ден - цяло число в интервала [1...50]
// На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
// На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minWalk = Integer.parseInt(scanner.nextLine());
        int timesWalk = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int burnedCal = minWalk *timesWalk * 5;

        if (burnedCal >= calories / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCal);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCal);
        }


    }
}
