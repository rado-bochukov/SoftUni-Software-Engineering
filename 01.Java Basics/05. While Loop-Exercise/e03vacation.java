package w05Excersise;

import java.util.Scanner;

public class e03vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());


        int totalDays = 0;
        int daysSpending = 0;
        boolean failedToSave = false;

        while (currentMoney < moneyNeeded) {

            if (daysSpending == 5) {
                failedToSave = true;
                break;
            }

            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());


            switch (action) {


                case "spend":
                    daysSpending++;
                    totalDays++;
                    currentMoney -= amount;
                    if (currentMoney < 0)
                        currentMoney = 0;
                    continue;


                case "save":
                    currentMoney += amount;
                    totalDays++;
                    daysSpending = 0;
                    break;
            }
        }
        if (failedToSave) {
            System.out.printf("You can't save the money.%n");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
