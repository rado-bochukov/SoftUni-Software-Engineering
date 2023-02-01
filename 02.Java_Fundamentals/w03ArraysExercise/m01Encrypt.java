package w03ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class m01Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int words= Integer.parseInt(scanner.nextLine());

        int encrypt=0;
        int[] encryptedArray=new int[words];

        for (int i = 0; i <words ; i++) {

            String input = scanner.nextLine();

            for (int j = 0; j <input.length() ; j++) {

                if(input.charAt(j)=='a'||input.charAt(j)=='e'||input.charAt(j)=='o'||input.charAt(j)=='u'||input.charAt(j)=='i'||
                        input.charAt(j)=='A'||input.charAt(j)=='E'||input.charAt(j)=='O'||input.charAt(j)=='U'||input.charAt(j)=='I') {
                    encrypt+=input.charAt(j)*input.length();
                }else {
                    encrypt+=input.charAt(j)/input.length();

                }
            }
            encryptedArray[i]=encrypt;
            encrypt=0;
        }
        Arrays.sort(encryptedArray);
        for (int i = 0; i <encryptedArray.length ; i++) {
            System.out.println(encryptedArray[i]);

        }

    }
}
