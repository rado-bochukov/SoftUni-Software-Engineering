package exam20and21April2019;

import java.util.Scanner;

public class e02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson= Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceCake=0.1*budget;

        double cost = guests*pricePerPerson;

        if(guests>=10 && guests<=15) {
            cost-=0.15*cost;
        }else if(guests>15&&guests<=20) {
            cost-=0.2*cost;
        }else if (guests>20) {
            cost-=0.25*cost;
        }

        double totalCost = cost+priceCake;
        double difference = Math.abs(budget-totalCost);

        if (budget>=totalCost) {
            System.out.printf("It is party time! %.2f leva left.",difference);
        }else {
            System.out.printf("No party! %.2f leva needed.",difference);
        }
    }
}
