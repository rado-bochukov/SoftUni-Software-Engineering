package w04Excersise;

import java.util.Scanner;

public class t01BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double sumEven = 0;
        double sumOdd = 0;

        for (int i = 1800; i <= year; i++) {

            if (i % 2 == 0) {
                sumEven += 12000;
            } else {
                sumOdd += 12000 + 50 * (18 + i - 1800);
            }

        }
        double moneyNeeded = sumEven + sumOdd;
        double diff = Math.abs(money - moneyNeeded);

        if (money >= moneyNeeded) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.",diff);
        }


    }
}
