package w04MethodsExercise;

import java.util.Scanner;

public class e04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password=scanner.nextLine();

        if(is6to10characters(password)&&isOnlyLettersAndDigits(password)&&isHaveTwoDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!is6to10characters(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!isOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean is6to10characters(String password) {
        return (password.length()>=6 && password.length()<=10);
    }
    private static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i <password.length() ; i++) {
            if(!Character.isLetter(password.charAt(i))&&!Character.isDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static boolean isHaveTwoDigits(String password) {
        int counter=0;
        for (int i = 0; i <password.length() ; i++) {
            if(Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }
        if(counter<2) {
            return false;
        }
        return true;
    }
}
