package w04MethodsExercise;

import java.util.Scanner;

public class e02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        int vowels = vowelsCount(input);
        System.out.println(vowels);
    }

    private static int vowelsCount(String input) {
        int vowelsCount=0;
        for (int i = 0; i <input.length() ; i++) {

            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='i'
            ||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='O'||input.charAt(i)=='U'||input.charAt(i)=='I'){
                vowelsCount++;
            }

        }
        return vowelsCount;
    }
}
