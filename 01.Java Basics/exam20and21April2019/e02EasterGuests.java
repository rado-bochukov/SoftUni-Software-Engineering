package exam20and21April2019;

import java.util.Scanner;

public class e02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double guests = Double.parseDouble(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double cakeCount=Math.ceil(guests/3);
        double eggsCount=guests*2;
        double eggsNeeded=eggsCount*0.45;
        double cakeCost=cakeCount*4;


        double totalCost=eggsNeeded+cakeCost;
        double diff = Math.abs(budget-totalCost);

        if(budget>=totalCost) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",cakeCount,eggsCount);
            System.out.printf("He has %.2f lv. left.",diff);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",diff);
        }
    }
}
