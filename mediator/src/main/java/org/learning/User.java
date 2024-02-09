package org.learning;

public class User {
    private final String name;
    private final ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    public void send(String message) {
        System.out.println(this.name + " sends message: " + message);
        chatRoom.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}