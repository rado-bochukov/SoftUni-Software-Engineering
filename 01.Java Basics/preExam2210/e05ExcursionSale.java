package preExam2210;

import java.util.Scanner;

public class e05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPackSea =Integer.parseInt(scanner.nextLine());
        int startingPackMountain =Integer.parseInt(scanner.nextLine());

        int profit=0;

        String input = scanner.nextLine();

        while(!input.equals("Stop")) {

            if (input.equals("sea")) {
                if (startingPackSea>0) {
                    startingPackSea--;
                    profit+=680;
                }else {
                    input=scanner.nextLine();
                    continue;
                }
             }else if (input.equals("mountain")) {
                if (startingPackMountain>0) {
                    startingPackMountain--;
                    profit+=499;
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }

            if (startingPackSea==0 && startingPackMountain==0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }else {
                input=scanner.nextLine();
            }
        }
        System.out.printf("Profit: %d leva.",profit);
    }
}
