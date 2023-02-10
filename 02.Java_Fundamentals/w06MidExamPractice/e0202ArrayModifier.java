package w06MidExamPractice;

import java.util.Scanner;

public class e0202ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] streamOfNums=scanner.nextLine().split(" ");
        int[]numbers=new int[streamOfNums.length];

        for (int i = 0; i <streamOfNums.length ; i++) {
            numbers[i]=Integer.parseInt(streamOfNums[i]);
        }
        String input=scanner.nextLine();

        while(!input.equals("end")) {
            String[]action=input.split(" ");

            switch(action[0]) {
                case "swap":
                    swapIndexes(numbers,action);
                    break;
                case "multiply":
                    multiplyIndexe(numbers,action);
                    break;
                case "decrease":
                    decreaseAllElements(numbers);
                    break;
            }
                input=scanner.nextLine();
        }

        for (int i = 0; i <numbers.length ; i++) {
            if(i==numbers.length-1) {
                System.out.println(numbers[i]);
                break;
            }

            System.out.print(numbers[i]+", ");
        }

    }

    private static void decreaseAllElements(int[] numbers) {
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]--;

        }
    }

    private static void multiplyIndexe(int[] numbers, String[] action) {
        int index1=Integer.parseInt(action[1]);
        int index2=Integer.parseInt(action[2]);

        numbers[index1]=numbers[index1]*numbers[index2];

    }

    private static void swapIndexes(int[] numbers , String []action) {
        int index1=Integer.parseInt(action[1]);
        int index2=Integer.parseInt(action[2]);

        int index1Value=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=index1Value;
    }
}
