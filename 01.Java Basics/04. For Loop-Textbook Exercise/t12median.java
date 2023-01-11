package w04Excersise;

import java.util.Scanner;

public class t12median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double sum = 0;

        for (int i = 1; i <=n; i++) {

            double num = Double.parseDouble(scanner.nextLine());
            sum+=num;


        }
        double average = sum/n;

        System.out.printf("%.2f",average);
    }
}
