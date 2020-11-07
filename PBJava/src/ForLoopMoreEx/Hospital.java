package ForLoopMoreEx;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int patientsTreated = 0;
        int patientsUntreated = 0;
        int sumPatients = 0;


        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (patientsUntreated > patientsTreated) {
                    doctors++;
                }
            }
            if (patients > doctors) {
                patientsUntreated += patients - doctors;
                patientsTreated += doctors;
            }

            if (patients <= doctors) {
                if (patients == doctors) {
                    patientsTreated += doctors;
                }
                if (patients < doctors) {
                    patientsTreated += patients;
                }


            }

        }
        System.out.printf("Treated patients: %d.\n", patientsTreated);
        System.out.printf("Untreated patients: %d.", patientsUntreated);
    }
}