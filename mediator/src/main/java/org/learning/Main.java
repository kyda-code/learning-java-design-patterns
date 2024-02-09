package org.learning;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);

        alice.send("Hello, Bob!");
        bob.send("Hi, Alice!");
    }
}