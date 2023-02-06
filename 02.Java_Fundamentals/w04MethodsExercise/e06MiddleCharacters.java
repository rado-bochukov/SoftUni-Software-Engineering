package w04MethodsExercise;

import java.util.Scanner;

public class e06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        String midChars=getMiddleChars(input);
        System.out.println(midChars);
    }

    private static String getMiddleChars(String input) {
        String result="";

        if (input.length()%2==0) {
            result+= input.charAt(input.length()/2-1);
            result+= input.charAt((input.length()/2));
        }else {
            result+= input.charAt((input.length()/2));
        }
        return result;
    }
}
