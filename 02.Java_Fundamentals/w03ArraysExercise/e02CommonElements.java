package w03ArraysExercise;

import java.util.Scanner;

public class e02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array1 = scanner.nextLine();
        String[] array1Elements=array1.split("\\s+");

        String array2 = scanner.nextLine();
        String[] array2Elements=array2.split("\\s+");

        for (int i = 0; i <array2Elements.length ; i++) {

            for (int j = 0; j <array1Elements.length ; j++) {

                if (array2Elements[i].equals(array1Elements[j])) {
                    System.out.print(array2Elements[i]+" ");
                }

            }

        }
    }
}
