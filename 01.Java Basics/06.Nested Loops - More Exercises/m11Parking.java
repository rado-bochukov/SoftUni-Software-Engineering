package w06Excersice;

import java.util.Scanner;

public class m11Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double currentBill = 0;
        double totalBill = 0;
        int dayCounter=0;

        for (int i = 1; i <=days; i++) {
            dayCounter++;

            for (int j = 1; j <=hours ; j++) {

                if (i%2==0 && j%2!=0) {
                    currentBill+=2.50;
                    totalBill+=2.50;
                }else if (i%2!=0 && j%2==0) {
                    currentBill+=1.25;
                    totalBill+=1.25;
                }else {
                    currentBill++;
                    totalBill++;
                }

            }
            System.out.printf("Day: %d - %.2f leva%n",dayCounter , currentBill);
            currentBill=0;

        }
        System.out.printf("Total: %.2f leva",totalBill);
    }
}
