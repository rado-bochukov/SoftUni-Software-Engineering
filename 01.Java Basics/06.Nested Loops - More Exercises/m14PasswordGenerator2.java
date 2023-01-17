package w06Excersice;

import java.util.Scanner;

public class m14PasswordGenerator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.parseInt(scanner.nextLine());
        int maxLetter = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=maxNumber ; i++) {

            for (int j = 1; j <=maxNumber ; j++) {

                for (char k = 'a'; k <97+maxLetter ; k++) {

                    for (char l = 'a'; l <97+maxLetter ; l++) {

                        for (int m = 1; m <=maxNumber ; m++) {

                            if (m>i && m>j) {

                                System.out.printf("%d%d%c%c%d ",i,j,k,l,m);
                            }

                        }


                        
                    }

                }

            }

        }
    }
}
