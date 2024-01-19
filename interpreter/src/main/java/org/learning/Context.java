package org.learning;

import java.util.StringTokenizer;

public class Context {
    private final StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            throw new RuntimeException("WARNING: missing token");
        }
        nextToken();
    }
}