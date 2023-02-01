package w03ArraysExercise;

import java.util.Scanner;

public class m02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[] current = new int[]{1};
        System.out.println(1);

        for (int i = 2; i <=rows; i++) {
            int [] array=new int[current.length+1];

            for (int j = 0; j < array.length; j++) {
                if (j == 0) {
                    array[j] = 1;
                } else  if (j==array.length-1) {

                    array[j] = current[j - 1] ;
                }else {
                    array[j] = current[j - 1] + current[j];
                }
                System.out.print(array[j]+" ");

            }
            System.out.println();
            current=array;

        }
    }
}
