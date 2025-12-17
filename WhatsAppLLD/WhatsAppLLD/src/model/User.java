package model;

import enums.UserStatus;

public class User {

    private String userId;
    private String name;
    private String phoneNumber;
    private UserStatus status;

    public User(String userId, String name, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = UserStatus.OFFLINE;
    }

    public String getName() {
        return name;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void goOnline() {
        this.status = UserStatus.ONLINE;
        System.out.println(name + " is ONLINE");
    }

    public void goOffline() {
        this.status = UserStatus.OFFLINE;
        System.out.println(name + " is OFFLINE");
    }

    // Observer method
    public void receiveMessage(Message message) {
        System.out.println(
            name + " received message: \"" + message.getContent() + "\""
        );
    }
}
