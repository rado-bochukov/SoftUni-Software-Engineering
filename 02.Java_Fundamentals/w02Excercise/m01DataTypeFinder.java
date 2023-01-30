package w02Excercise;

import java.util.Scanner;

public class m01DataTypeFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (input.length() == 1) {
                switch (input.charAt(0)) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        System.out.println(input + " is integer type");
                        input = scanner.nextLine();
                        continue;
                    default:
                        System.out.println(input + " is character type");
                        input = scanner.nextLine();
                        continue;
                }
            } else {
                if (input.equals("true") || input.equals("false")) {
                    System.out.println(input + " is boolean type");
                    input = scanner.nextLine();
                    continue;
                }
                for (int i = 0; i < input.length(); i++) {

                    if (input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '0' && input.charAt(i) != '1' && input.charAt(i) != '2' &&
                            input.charAt(i) != '3' && input.charAt(i) != '4' && input.charAt(i) != '5' && input.charAt(i) != '6' && input.charAt(i) != '7' && input.charAt(i) != '8' && input.charAt(i) != '9') {
                        System.out.println(input + " is string type");
                        break;
                    }else {
                        if(input.contains(".")){
                            System.out.println(input+" is floating point type");
                            break;
                        }else {
                            System.out.println(input+ " is integer type");
                            break;
                        }
                    }
                }
            }

            input = scanner.nextLine();

        }
    }
}
