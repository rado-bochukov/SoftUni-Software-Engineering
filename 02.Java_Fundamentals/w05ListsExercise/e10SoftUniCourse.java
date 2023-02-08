package w05ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e10SoftUniCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> themes = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("course start")) {
                break;
            }
            String[] action = input.split(":");

            String lessonTitle = action[1];
            String lessonExercise = action[1] + "-Exercise";

            switch (action[0]) {
                case "Add":
                    if (!themes.contains(lessonTitle)) {
                        themes.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(action[2]);
                    if (!themes.contains(lessonTitle)) {
                        if (indexToInsert >= 0 && indexToInsert < themes.size()) {
                            themes.add(indexToInsert, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                        themes.remove(lessonTitle);
                        themes.remove(lessonExercise);
                    break;
                case "Swap":
                    String lessonTitle2 = action[2];
                    String exerciseTitle2 = action[2] + "-Exercise";
                    if (themes.contains(lessonTitle) && themes.contains(lessonTitle2)) {

                        int index1 = themes.indexOf(lessonTitle);
                        int index2 = themes.indexOf(lessonTitle2);

                        themes.add(index2, lessonTitle);
                        themes.remove(lessonTitle2);
                        themes.remove(lessonTitle);
                        themes.add(index1, lessonTitle2);
                    }
                    if (themes.contains(lessonExercise)) {
                        themes.remove(lessonExercise);
                        themes.add(themes.indexOf(lessonTitle) + 1, lessonExercise);
                    }
                    if (themes.contains(exerciseTitle2)) {
                        themes.remove(exerciseTitle2);
                        themes.add(themes.indexOf(lessonTitle2) + 1, exerciseTitle2);
                    }
                    break;
                case "Exercise":
                    if (themes.contains(lessonTitle)&&!themes.contains(lessonExercise)) {
                        themes.add(themes.indexOf(lessonTitle) + 1, lessonExercise);
                    } else if(!themes.contains(lessonTitle)){
                        themes.add(lessonTitle);
                        themes.add(lessonExercise);
                    }
                    break;
            }
        }
        for (int i = 0; i < themes.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, themes.get(i));
        }
    }
}

