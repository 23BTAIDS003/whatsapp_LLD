package model;

import enums.MessageStatus;
import enums.MessageType;

public class Message {

    private String messageId;
    private User sender;
    private String content;
    private MessageType type;
    private MessageStatus status;
    private long timestamp;

    public Message(String messageId, User sender, String content) {
        this.messageId = messageId;
        this.sender = sender;
        this.content = content;
        this.type = MessageType.TEXT;
        this.status = MessageStatus.SENT;
        this.timestamp = System.currentTimeMillis();
    }

    public void markDelivered() {
        status = MessageStatus.DELIVERED;
        System.out.println("✔ Message delivered");
    }

    public void markRead() {
        status = MessageStatus.READ;
        System.out.println("✔✔ Message read");
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }
}
