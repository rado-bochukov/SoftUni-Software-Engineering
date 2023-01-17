package w06Excersice;

import java.util.Scanner;

public class m06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char lastSector = input.charAt(0);

        int firstSecRows = Integer.parseInt(scanner.nextLine());
        int seatsOddSectors = Integer.parseInt(scanner.nextLine());
        int counterRows = 0;

        int totalSeatsCounter=0;


        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= firstSecRows; j++) {
                if (j % 2 == 0) {
                    for (char k = 'a'; k <='z'; k++) {
                        counterRows++;
                        if (counterRows <= seatsOddSectors + 2) {
                            System.out.printf("%c%d%c%n", i, j, k);
                            totalSeatsCounter++;
                        } else {
                            counterRows = 0;
                            break;
                        }
                    }
                } else {
                    for (char k = 'a'; k <='z'; k++) {
                        counterRows++;
                        if (counterRows <= seatsOddSectors ) {
                            System.out.printf("%c%d%c%n", i, j, k);
                            totalSeatsCounter++;
                        } else {
                            counterRows = 0;
                            break;
                        }
                    }

                }



            }
            firstSecRows++;
        }
        System.out.printf("%d",totalSeatsCounter);
    }
}
