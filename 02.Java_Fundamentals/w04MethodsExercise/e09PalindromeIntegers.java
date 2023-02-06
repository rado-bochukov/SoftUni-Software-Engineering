package w04MethodsExercise;

import java.util.Scanner;

public class e09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        while(!input.equals("END")) {

            System.out.println(isPalindrome(input));
            input=scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {

        int indexLeft=0;
        int indexRight=0;

        if(input.length()%2==0) {
            indexLeft=input.length()/2-1;
            indexRight=input.length()/2;
        }else {
            indexLeft=input.length()/2;
            indexRight=input.length()/2;
        }
        while (indexRight<input.length()) {
            if (input.charAt(indexLeft)==input.charAt(indexRight)) {
                indexLeft--;
                indexRight++;
            }else {
                return false;
            }
        }
        return true;

    }
}
