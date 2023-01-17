package w06Excersice;

import java.util.Scanner;

public class m02SecretDoor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <=a; i+=2) {

            for (int j = 1; j <=b ; j++) {

                if (j==1 || j==4 ||j==6||j==8||j==9) {
                    continue;
                }
                for (int k = 2; k <=c ; k+=2) {

                    System.out.printf("%d %d %d%n",i,j,k);


                }



            }

        }
    }
}
