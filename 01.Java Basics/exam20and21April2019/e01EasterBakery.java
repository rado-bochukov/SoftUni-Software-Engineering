package exam20and21April2019;

import java.util.Scanner;

public class e01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double weightFlour = Double.parseDouble(scanner.nextLine());
        double weightSugar = Double.parseDouble(scanner.nextLine());
        int eggPacks = Integer.parseInt(scanner.nextLine());
        int yeastPacks = Integer.parseInt(scanner.nextLine());

        double priceSugar=0.75*priceFlour;
        double priceEggs = 1.1*priceFlour;
        double yeastPrice=0.2*priceSugar;

        double totalCost=priceFlour*weightFlour+priceSugar*weightSugar+eggPacks*priceEggs+yeastPacks*yeastPrice;

        System.out.printf("%.2f",totalCost);
    }
}
