package w06Excersice;

import java.util.Scanner;

public class m04Carplate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int nStart = Integer.parseInt(scanner.nextLine());
        int nEnd = Integer.parseInt(scanner.nextLine());

        for (int i = nStart; i <=nEnd ; i++) {

            for (int j = nStart; j <=nEnd ; j++) {

                for (int k = nStart; k <=nEnd ; k++) {

                    for (int l = nStart; l <=nEnd ; l++) {

                        if (i%2==0 && l%2==0) {

                            continue;

                        }else if (i%2!=0 && l%2!=0) {

                            continue;

                        }else if (i<=l) {

                            continue;
                        }else if ((j+k)%2!=0) {

                            continue;
                        }else {

                            System.out.printf("%d%d%d%d ",i , j , k , l);
                        }

                    }

                }

            }

        }


    }
}
