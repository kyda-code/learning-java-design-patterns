package org.learning;

public class Prototype implements Copyable {
    private final String field;

    public Prototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype copy() {
        return new Prototype(this.field);
    }

    @Override
    public String toString() {
        return field;
    }
}