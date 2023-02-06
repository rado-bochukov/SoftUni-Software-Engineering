package w04MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class e01SmallestOFThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallestNum = getSmallestInt(num1, num2, num3);
        System.out.println(smallestNum);
    }

    private static int getSmallestInt(int num1, int num2, int num3) {
        int[] array=new int [] {num1,num2,num3};
        Arrays.sort(array);
        return array[0];
    }


}

//    private static int getSmallestInt(int num1, int num2, int num3) {
//        int smallerInt=getSmallerInt(num2,num3);
//        if(num1<smallerInt) {
//            return num1;
//        }return smallerInt;
//    }
//
//    private static int getSmallerInt(int num2, int num3) {
//        if (num2<num3){
//            return num2;
//        }return num3;
//    }
//}
