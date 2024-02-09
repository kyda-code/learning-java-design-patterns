package org.learning;

public class ArticleMemento {
    private final String title;
    private final String content;

    public ArticleMemento(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}