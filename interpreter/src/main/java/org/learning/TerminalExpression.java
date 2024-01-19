package org.learning;

public class TerminalExpression implements Expression {
    private final String literal;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getCurrentToken().equals(literal);
    }
}