package w04Excersise;

import java.util.Scanner;

public class t03Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countItems = Integer.parseInt(scanner.nextLine());

        int busCargo = 0;
        int truckCargo = 0;
        int trainCargo = 0;

        for (int i = 1; i <= countItems; i++) {

            int weightCargo = Integer.parseInt(scanner.nextLine());

            if (weightCargo <= 3) {
                busCargo += weightCargo;
            } else if (weightCargo <= 11) {
                truckCargo += weightCargo;
            } else {
                trainCargo += weightCargo;
            }
        }
        double totalPriceCargo = busCargo * 200 + truckCargo * 175 + trainCargo * 120;
        double totalWeight = busCargo + truckCargo + trainCargo;
        double averagePricePerTon = totalPriceCargo / (totalWeight);

        double percentBusCargo = busCargo / totalWeight * 100;
        double percentTruckCargo = truckCargo / totalWeight * 100;
        double percentTrainCargo = trainCargo / totalWeight * 100;

        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n", percentBusCargo);
        System.out.printf("%.2f%%%n", percentTruckCargo);
        System.out.printf("%.2f%%%n", percentTrainCargo);


    }
}
