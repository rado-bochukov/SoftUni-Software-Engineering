package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e04Articles2 {

    static class Article {

        String title;
        String content;
        String author;



        public void ToString() {

            System.out.printf("%s - %s: %s%n", this.title, this.content, this.author);
        }

        Article(String title, String content, String author) {

            this.title = title;
            this.content = content;
            this.author = author;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Article> articles = new ArrayList<>();

        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {

        String[] line = scanner.nextLine().split(", ");
        String title = line[0];
        String content = line[1];
        String author = line[2];

        Article initialArticle = new Article(title, content, author);
        articles.add(initialArticle);

        }

        String unused=scanner.nextLine();

        for (Article article : articles) {

        article.ToString();
        }

    }
}
