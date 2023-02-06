package w04MethodsExercise;

import java.util.Scanner;

public class e07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        getMatrix(n);
    }

    private static void getMatrix(int n) {
        String row="";

        for (int i = 1; i <=n; i++) {

            for (int j = 0; j <n ; j++) {
                row+=n+" ";

            }
            System.out.println(row);
            row="";


        }
    }
}
