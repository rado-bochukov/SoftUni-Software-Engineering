package w02Excercise;

import java.util.Scanner;

public class m05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String decryptedMessage="";

        for (int i = 0; i <lines ; i++) {

            char given=scanner.nextLine().charAt(0);
            char decrypted = (char)(given+key);
            decryptedMessage+=decrypted;


        }
        System.out.println(decryptedMessage);
    }
}
