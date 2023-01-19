package exam18and19July2020;

import java.util.Scanner;

public class e02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        int daysTillTrip = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double priceForLuggage = 0;

        if (weight<10) {
            priceForLuggage=0.2*priceOver20kg;
        }else if (weight<=20) {
            priceForLuggage = 0.5*priceOver20kg;
        }else {
            priceForLuggage=priceOver20kg;
        }


        if (daysTillTrip<7) {
            priceForLuggage+=priceForLuggage*0.4;
        }else if(daysTillTrip<=30) {
            priceForLuggage+=priceForLuggage*0.15;
        }else {
            priceForLuggage+=priceForLuggage*0.1;
        }

        double totalCost = priceForLuggage*luggageCount;

        System.out.printf(" The total price of bags is: %.2f lv. ",totalCost);
    }
}
