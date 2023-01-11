package w04Excersise;

import java.util.Scanner;

public class e04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double savedMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += 10 * i / 2.0 - 1;
            } else {
                toysCount += 1;
            }
        }
        double toysMoney=toysCount*toyPrice;

        double totalMoneySaved=toysMoney+savedMoney;
        double diff=Math.abs(priceLaundry-totalMoneySaved);

        if (priceLaundry<=totalMoneySaved) {
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
