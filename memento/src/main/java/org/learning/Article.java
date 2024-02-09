package org.learning;

public class Article {
    private String title;
    private String content;

    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

    public ArticleMemento save(){
        return new ArticleMemento(title, content);
    }

    public void restore(ArticleMemento memento){
        title = memento.getTitle();
        content = memento.getContent();
    }

    public void setTitle(String secondTitle) {
    }

    public void setContent(String secondContent) {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}