package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.Scanner;

public class E0602Articles {

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public void renewTitle(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s",
                    getTitle(), getContent(), getAuthor());

        }
    }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String[] newItems = scanner.nextLine().split(", ");
            String title = newItems[0];
            String author = newItems[1];
            String content = newItems[2];

            Article article = new Article(title, author, content);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {

                String[] input = scanner.nextLine().split(": ");

                switch (input[0]) {
                    case "Edit":
                        article.editContent(input[1]);
                        break;
                    case "ChangeAuthor":
                        article.changeAuthor(input[1]);
                        break;
                    case "Rename":
                        article.renewTitle(input[1]);
                        break;
                }

            }
            System.out.println(article.toString());
        }
    }






