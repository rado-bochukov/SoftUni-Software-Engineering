package w04Excersise;

import java.util.Scanner;

public class t06bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthsCount = Integer.parseInt(scanner.nextLine());

        double totalElectricity = 0;
        double totalWater = 20 * monthsCount;
        double totalInternet = 15 * monthsCount;
        double totalOther = 0;

        for (int i = 1; i <= monthsCount; i++) {

            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricity;
            totalOther += (electricity + 35) * 1.2;


        }

        double average = (totalElectricity + totalWater + totalInternet + totalOther) / monthsCount;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOther);
        System.out.printf("Average: %.2f lv%n", average);


    }
}
