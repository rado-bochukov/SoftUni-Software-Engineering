package w01Exercise;

import java.util.Scanner;

public class e08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int rows=num;
        int cols=num;

        for (int i = 1; i <=rows ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.printf("%d ",i);

            }
            System.out.println("");

        }
    }
}
