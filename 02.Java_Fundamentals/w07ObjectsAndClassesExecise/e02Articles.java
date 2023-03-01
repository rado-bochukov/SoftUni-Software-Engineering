package w07ObjectsAndClassesExecise;

import java.util.List;
import java.util.Scanner;

public class e02Articles {

    static class Article{

        String title;
        String content;
        String author;
        public void Rename(String title) {
            this.title = title;
        }
        public void Edit(String content) {
            this.content = content;
        }
        public void ChangeAuthor(String author) {
            this.author = author;
        }
        public void ToString(){

            System.out.printf("%s - %s: %s%n",this.title,this.content,this.author);
        }
        Article(String title, String content, String author){

            this.title = title;
            this.content = content;
            this.author = author;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]line=scanner.nextLine().split(", ");
        String title=line[0];
        String content=line[1];
        String author=line[2];

        Article initialArticle=new Article(title,content,author);

        int commands=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {

            String []command=scanner.nextLine().split(": ");

            if(command[0].equals("Edit")){
                initialArticle.Edit(command[1]);
            }else if(command[0].equals("ChangeAuthor")){
                initialArticle.ChangeAuthor(command[1]);
            }else if(command[0].equals("Rename")) {
                initialArticle.Rename(command[1]);
            }
        }

        initialArticle.ToString();
    }
}
