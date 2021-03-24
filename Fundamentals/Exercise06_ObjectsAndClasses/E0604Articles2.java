package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.*;

public class E0604Articles2 {

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

        public String toString() {
            return String.format("%s - %s: %s%n",
                    getTitle(), getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] newItems = scanner.nextLine().split(", ");
            String title = newItems[0];
            String author = newItems[1];
            String content = newItems[2];

            Article article = new Article(title, author, content);

            articleList.add(article);
        }

        String input = scanner.nextLine();

        switch (input) {
            case "title":
                articleList.stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .forEach(article -> System.out.print(article.toString()));
                break;
            case "content":
                articleList.stream()
                        .sorted((c1, c2) -> c1.getContent().compareTo(c2.getContent()))
                        .forEach(article -> System.out.print(article.toString()));
                break;
            case "author":
                articleList.stream()
                        .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(article -> System.out.print(article.toString()));
                break;
        }
    }
}






