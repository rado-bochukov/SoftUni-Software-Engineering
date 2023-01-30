package w02Excercise;

import java.util.Scanner;

public class m06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean foundOpenBracket = false;
        boolean balanced = false;
        int counterOpen=0;
        int counterClosed=0;
        boolean firstClosed=false;

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            if (input.equals("(") && !foundOpenBracket) {
                foundOpenBracket = true;
                counterOpen++;
            } else if (input.equals("(") && foundOpenBracket) {
                break;
            } else if (input.equals(")") && foundOpenBracket) {
                foundOpenBracket=false;
                counterClosed++;
            }else if (input.equals(")")&& !foundOpenBracket) {
                firstClosed=true;
                break;
            }
        }
        if (counterOpen==counterClosed) {
            balanced=true;
        }
        if (firstClosed) {
            System.out.println("UNBALANCED");
        }else if (balanced) {
        System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
