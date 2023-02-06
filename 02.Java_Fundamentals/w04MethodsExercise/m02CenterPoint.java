package w04MethodsExercise;

import java.util.Scanner;

public class m02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1= Integer.parseInt(scanner.nextLine());
        int y1=Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        getClosestPoint(x1,y1,x2,y2);
    }

    private static void getClosestPoint(int x1 , int y1 , int x2, int y2) {

        double c1= Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
        double c2= Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
        if (c1<c2||c1==c2) {
            System.out.printf("(%d, %d)",x1,y1);
        }else {
            System.out.printf("(%d, %d)",x2,y2);
        }
    }
}
