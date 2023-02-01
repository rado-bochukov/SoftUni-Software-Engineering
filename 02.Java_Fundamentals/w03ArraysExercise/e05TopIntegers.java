package w03ArraysExercise;

import java.util.Scanner;

public class e05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersFlow = scanner.nextLine().split("\\s+");
        int [] numbers = new int[numbersFlow.length];

        boolean isBigger=false;

        for (int i = 0; i <numbers.length ; i++) {

            numbers[i]=Integer.parseInt(numbersFlow[i]);
        }
        for (int i = 0; i <numbers.length ; i++) {

            for (int j = numbers.length-1; j >i ; j--) {

                if (numbers[j]<numbers[i]) {
                    isBigger=true;
                }else {
                    isBigger=false;
                    break;
                }
            }
            if (i== numbers.length-1) {
                isBigger=true;
            }
            if (isBigger) {
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
