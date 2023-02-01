package w03ArraysExercise;

import java.util.Scanner;

public class e09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int bestSample = 0;
        int currentSample = 0;
        int earliestIndex = Integer.MAX_VALUE;
        int bestSampleSeq = 0;
        int bestSampleSum = 0;
        int sumOnes = 0;

        int[] bestSampleString = new int[length];

        while (!input.equals("Clone them!")) {

            String[] dna = input.split("!+");
            int[] currentDnaOnes = new int[dna.length];

            for (int i = 0; i < currentDnaOnes.length; i++) {
                currentDnaOnes[i] = Integer.parseInt(dna[i]);
            }
            currentSample++;
            int maxSeqs = 0;
            int startIndex = Integer.MAX_VALUE;

            for (int index = 0; index < currentDnaOnes.length; index++) {
                int seqCounter = 0;
                for (int j = index; j < currentDnaOnes.length; j++) {

                    if (currentDnaOnes[index] == currentDnaOnes[j]&&currentDnaOnes[index]==1) {
                        seqCounter++;
                        if (seqCounter > maxSeqs) {
                            maxSeqs = seqCounter;
                            startIndex = index;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (maxSeqs > bestSampleSeq) {
                bestSampleSeq = maxSeqs;
                bestSample = currentSample;
                earliestIndex = startIndex;
                bestSampleString = currentDnaOnes;
            } else if (maxSeqs == bestSampleSeq) {

                if (startIndex < earliestIndex) {
                    earliestIndex = startIndex;
                    bestSample = currentSample;
                    bestSampleString = currentDnaOnes;
                } else if (startIndex == earliestIndex) {

                    for (int i = 0; i < bestSampleString.length; i++) {
                        bestSampleSum += bestSampleString[i];
                    }
                    for (int i = 0; i < currentDnaOnes.length; i++) {
                        sumOnes += currentDnaOnes[i];
                    }
                    if (sumOnes > bestSampleSum) {
                        bestSampleString = currentDnaOnes;
                        bestSample = currentSample;
                        bestSampleSum = sumOnes;
                    }
                }
            }
            input = scanner.nextLine();
        }

        bestSampleSum = 0;
        for (int i = 0; i < bestSampleString.length; i++) {
            bestSampleSum += bestSampleString[i];
        }
        if (bestSampleSum == 0) {
            bestSample = 1;
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestSampleSum);
        for (
                int i = 0;
                i < bestSampleString.length; i++) {
            System.out.print(bestSampleString[i] + " ");
        }
    }
}
