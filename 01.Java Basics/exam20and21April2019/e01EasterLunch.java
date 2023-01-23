package exam20and21April2019;

import java.util.Scanner;

public class e01EasterLunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int easterCake = Integer.parseInt(scanner.nextLine());
        int eggPacks = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double easterCakeCost = easterCake*3.2;
        double eggsPrice = eggPacks*4.35;
        double cookiesCost=cookiesKg*5.4;
        double eggPaintCost=eggPacks*12*0.15;

        double totalCost=easterCakeCost+eggsPrice+cookiesCost+eggPaintCost;

        System.out.printf("%.2f",totalCost);

    }
}
