package w05ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class e07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        //1 2 3 |4 5 6 |  7  8

        Collections.reverse(arrays);
        List<String> append = new ArrayList<>();

        for (String array : arrays) {

            String[] current = array.split("\\s+");
            append.addAll(Arrays.asList(current));
        }
        for (String s : append) {
            if (s.equals("")) {
                continue;
            }
            System.out.print(s + " ");
        }
    }
}
