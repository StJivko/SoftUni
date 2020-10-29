package BasicsSyntax;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int hours = 3;
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = hours * projects;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, projects);
    }
}
