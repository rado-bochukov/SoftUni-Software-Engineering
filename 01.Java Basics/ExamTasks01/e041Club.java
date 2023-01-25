package ExamTasks01;

import java.util.Scanner;

public class e041Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profitNeeded = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        String cocktail = "";

        double profitMade=0;
        double currentOrder=0;
        boolean reached = false;

        while(!input.equals("Party!")) {
            cocktail=input;
            int cocktailPrice = cocktail.length();
            int drinksCount=Integer.parseInt(scanner.nextLine());

            currentOrder=cocktailPrice*drinksCount;
            profitMade+=cocktailPrice*drinksCount;


            if (currentOrder%2!=0) {
                profitMade-=0.25*currentOrder;
            }
            if (profitMade>=profitNeeded) {
                System.out.println("Target acquired.");
                reached=true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!reached) {
            System.out.printf("We need %.2f leva more.%n",profitNeeded-profitMade);
            System.out.printf("Club income - %.2f leva.",profitMade);
        }else {
            System.out.printf("Club income - %.2f leva.",profitMade);
        }
    }
}
