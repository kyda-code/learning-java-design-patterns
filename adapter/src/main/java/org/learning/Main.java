package org.learning;

public class Main {
    public static void main(String[] args) {
        NewInterface newInterface = new Adapter(new OldService());
        System.out.println(newInterface.newRequest());
    }
}