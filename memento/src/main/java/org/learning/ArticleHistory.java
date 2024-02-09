package org.learning;

import java.util.Stack;

public class ArticleHistory {
    private final Stack<ArticleMemento> history = new Stack<>();

    public void push(ArticleMemento memento){
        history.push(memento);
    }

    public ArticleMemento pop(){
        return history.pop();
    }
}
