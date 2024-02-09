package org.learning;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("First Title", "First Content");
        ArticleHistory history = new ArticleHistory();

        System.out.println("Original Article");
        System.out.println("Title: " + article.getTitle());
        System.out.println("Content: " + article.getContent());

        // Let's edit the article and save the current state
        article.setTitle("Second Title");
        article.setContent("Second Content");
        history.push(article.save());

        System.out.println("\nEdited Article");
        System.out.println("Title: " + article.getTitle());
        System.out.println("Content: " + article.getContent());

        // Oops, we made a mistake. Let's undo to the last saved state
        article.restore(history.pop());

        System.out.println("\nAfter undo operation");
        System.out.println("Title: " + article.getTitle());
        System.out.println("Content: " + article.getContent());
    }
}