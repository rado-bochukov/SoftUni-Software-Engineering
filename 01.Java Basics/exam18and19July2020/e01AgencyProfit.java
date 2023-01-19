package exam18and19July2020;

import java.util.Scanner;

public class e01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childrenTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());


        double totalAdultTicketsPrice = (priceAdult + serviceFee) * adultTickets;
        double totalChildrenTicketsPrice = childrenTickets * ((priceAdult * 0.3) + serviceFee);
        double totalCost = totalAdultTicketsPrice + totalChildrenTicketsPrice;
        double profit = totalCost*0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company,profit);
    }
}
