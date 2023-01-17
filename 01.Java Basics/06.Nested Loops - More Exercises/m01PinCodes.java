package w06Excersice;

import java.util.Scanner;

public class m01PinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <=n1; i+=2) {

            for (int j = 2; j <=n2 ; j++) {

                if (j==1) {
                    continue;
                }else if (j==4){
                    continue;
                }else if (j==6){
                    continue;
                }else if (j==8){
                    continue;
                }else if (j==9){
                    continue;
                }

                for (int k = 2; k <=n3 ; k+=2) {


                    System.out.printf("%d %d %d%n",i,j,k);

                }

            }

        }
    }
}
