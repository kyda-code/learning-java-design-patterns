package org.learning;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private final List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Users should not receive their own messages
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}