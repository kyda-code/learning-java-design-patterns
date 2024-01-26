package org.learning;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("Hello Prototype");
        Prototype clone = prototype.copy();
        System.out.println(clone);
    }
}