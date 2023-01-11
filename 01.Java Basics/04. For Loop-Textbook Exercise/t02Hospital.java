package w04Excersise;

import java.util.Scanner;

public class t02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeframe = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= timeframe; i++) {

            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && (untreatedPatients > treatedPatients)) {
                doctors+=1;
            }
            if (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            } else {
                treatedPatients += patients;
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);
    }
}
