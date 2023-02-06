package w04MethodsExercise;

import java.util.Scanner;

public class m01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
                getDataType(type, number);
                break;
            case "real":
                double realNum = Double.parseDouble(scanner.nextLine());
                getDataType(type, realNum);
                break;
            case "string":
                String word = scanner.nextLine();
                getDataType(type, word);
                break;
        }
    }

    private static void getDataType(String s, int f) {
        System.out.printf("%d", f * 2);
    }

    private static void getDataType(String s, double f) {
        System.out.printf("%.2f", f * 1.5);
    }

    private static void getDataType(String s, String f) {
        System.out.println("$" + f + "$");
    }

}
