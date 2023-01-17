package w06Excersice;

import java.util.Scanner;

public class m10CoinsAndBills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count1 = Integer.parseInt(scanner.nextLine());
        int count2 = Integer.parseInt(scanner.nextLine());
        int count5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <=count1 ; i++) {

            for (int j = 0; j <=count2 ; j++) {

                for (int k = 0; k <=count5 ; k++) {

                    if (i+(j*2)+(k*5)==sum) {

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i , j , k , sum);
                    }

                }

            }

        }
    }
}
