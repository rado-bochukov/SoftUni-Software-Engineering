package w02Excercise;

import java.util.Scanner;

public class e08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegCounts=Integer.parseInt(scanner.nextLine());

        double volumeBiggest=0;
        double volCurrent=0;
        String biggestKeg="";

        for (int i = 1; i <=kegCounts ; i++) {

            String currentModel=scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volCurrent = Math.PI*radius*radius*height;

            if(volCurrent>=volumeBiggest) {
                volumeBiggest=volCurrent;
                biggestKeg=currentModel;
            }

        }
        System.out.println(biggestKeg);
    }
}
