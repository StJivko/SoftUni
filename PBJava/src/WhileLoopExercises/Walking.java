package WhileLoopExercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int steps = 0;
        int currentSteps = 0;
        int additionalSteps = 0;
        String action = "";

        while (steps < goal) {
            action = scanner.nextLine();
            if (action.equals("Going home")) {
                break;
            }
            currentSteps = Integer.parseInt(action);
            steps += currentSteps;
        }
        if (action.equals("Going home"))
        additionalSteps = Integer.parseInt(scanner.nextLine());
        steps += additionalSteps;
        if (steps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", steps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}