package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {

    protected String chatId;
    protected List<Message> messages = new ArrayList<>();

    public abstract void sendMessage(Message message);

    public List<Message> getMessages() {
        return messages;
    }
}
