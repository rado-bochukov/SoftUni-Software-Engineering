package ExamTasks01;

import java.util.Scanner;

public class e02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int additionalCostsPercent = Integer.parseInt(scanner.nextLine());

        double totalCost =0;

        if (nights<=7) {
            totalCost = nights*pricePerNight+((additionalCostsPercent*budget)/100);
        }else {
            totalCost = nights* (0.95*pricePerNight) + ((additionalCostsPercent*budget)/100);
        }

        double difference = Math.abs(budget-totalCost);

        if (totalCost<=budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",difference);
        }else {
            System.out.printf("%.2f leva needed.",difference);
        }
    }
}
