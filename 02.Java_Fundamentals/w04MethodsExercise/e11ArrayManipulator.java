package w04MethodsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class e11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String[] input = scanner.nextLine().split("\\s+");


        while (!input[0].equals("end")) {

            switch (input[0]) {
                case "exchange":
                    int index = Integer.parseInt(input[1]);
                    if (index >= numbers.length||index<0) {
                        System.out.println("Invalid index");
                    } else {
                        numbers = rearrangeTheArray(numbers, input);
                    }
                    break;
                case "max":
                    if (input[1].equals("even")) {
                        printMaxEven(numbers);
                    } else if (input[1].equals("odd")) {
                        printMaxOdd(numbers);
                    }
                    break;
                case "min":
                    if (input[1].equals("even")) {
                        printMinEven(numbers);
                    } else if (input[1].equals("odd")) {
                        printMinOdd(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(input[1]);

                    if (count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (input[2].equals("even")) {
                            printFirstEven(numbers, count);
                        } else if (input[2].equals("odd")) {
                            printFirstOdd(numbers, count);
                        }
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(input[1]);
                    if (countLast > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (input[2].equals("even")) {
                            printLastEven(numbers, countLast);
                        } else if (input[2].equals("odd")) {
                            printLastOdd(numbers, countLast);
                        }
                    }
                    break;
            }
            input = scanner.nextLine().split("\\s+");
        }
        System.out.println(Arrays.toString(numbers));

    }


    private static int[] rearrangeTheArray(int[] numbers, String[] input) {
        int[] currentArray = new int[numbers.length];
        int index = Integer.parseInt(input[1]);
        for (int i = 0; i < numbers.length; i++) {

            if (i + index + 1 >= numbers.length) {
                currentArray[i] = numbers[i + index + 1 - numbers.length];
            } else {
                currentArray[i] = numbers[i + index + 1];
            }
        }
        return currentArray;
    }

    private static void printMaxEven(int[] array) {
        int counter = 0;
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
                if (array[i] >= maxEven) {
                    maxEven = array[i];
                    indexMaxEven = i;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }

    private static void printMaxOdd(int[] array) {
        int counter = 0;
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
                if (array[i] >= maxOdd) {
                    maxOdd = array[i];
                    indexMaxOdd = i;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }
    }

    private static void printMinEven(int[] array) {
        int counter = 0;
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
                if (array[i] <= minEven) {
                    minEven = array[i];
                    indexMinEven = i;
                }
            }

        }
        if (counter == 0) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printMinOdd(int[] array) {
        int counter = 0;
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
                if (array[i] <= minOdd) {
                    minOdd = array[i];
                    indexMinOdd = i;
                }
            }

        }
        if (counter == 0) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }
    }

    private static void printFirstEven(int[] numbers, int count) {
        String evenArray = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray += numbers[i] + " ";
            }
        }
        if (evenArray.equals("")) {
            System.out.println("[]");
        } else {
            int[] evenArrayNums = Arrays.stream(evenArray
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (evenArrayNums.length <= count) {
                System.out.println(Arrays.toString(evenArrayNums));
            } else {
                int[] firstEvenCount = new int[count];
                for (int i = 0; i < count; i++) {
                    firstEvenCount[i] = evenArrayNums[i];
                }
                System.out.println(Arrays.toString(firstEvenCount));
            }
        }
    }

    private static void printFirstOdd(int[] numbers, int count) {
        String oddArray = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddArray += numbers[i] + " ";
            }
        }
        if (oddArray.equals("")) {
            System.out.println("[]");
        } else {
            int[] oddArrayNums = Arrays.stream(oddArray
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (oddArrayNums.length <= count) {
                System.out.println(Arrays.toString(oddArrayNums));
            } else {
                int[] firstOddCount = new int[count];
                for (int i = 0; i < count; i++) {
                    firstOddCount[i] = oddArrayNums[i];
                }
                System.out.println(Arrays.toString(firstOddCount));
            }
        }
    }

    private static void printLastEven(int[] numbers, int count) {
        String evenArray = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray += numbers[i] + " ";
            }
        }
        if (evenArray.equals("")) {
            System.out.println("[]");
        } else {
            int[] evenArrayNums = Arrays.stream(evenArray
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (evenArrayNums.length <= count) {
                System.out.println(Arrays.toString(evenArrayNums));
            } else {
                int[] LastEvenCount = new int[count];
                int evenIndex = 0;
                for (int i = evenArrayNums.length-count; i < evenArrayNums.length; i++) {
                    LastEvenCount[evenIndex] = evenArrayNums[i];
                    evenIndex++;
                }
                System.out.println(Arrays.toString(LastEvenCount));
            }
        }
    }

    private static void printLastOdd(int[] numbers, int count) {
        int[] oddsArray = new int[numbers.length];
        int foundsOdds = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 != 0) {
               oddsArray[index] = numbers[index];
               foundsOdds++;
            }
        }

        int odsToPrint = Math.min(foundsOdds, count);
        int[] resultArray = new int[odsToPrint];
        int addIndex = 0;
        if (odsToPrint > 0) {
            for (int index = foundsOdds - odsToPrint - count; index < foundsOdds; index++) {
                int currentNumber = oddsArray[index];
                resultArray[addIndex] = currentNumber;
                addIndex++;
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }
}
