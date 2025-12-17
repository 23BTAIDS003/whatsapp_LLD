package model;

public class PersonalChat extends Chat {

    private User sender;
    private User receiver;

    public PersonalChat(User sender, User receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.chatId = sender.getName() + "_" + receiver.getName();
    }

    @Override
    public void sendMessage(Message message) {

        System.out.println(
            message.getSender().getName() + " sent: " + message.getContent()
        );

        messages.add(message);

        // Simulate real-time delivery
        if (receiver.getStatus() == enums.UserStatus.ONLINE) {
            message.markDelivered();
            receiver.receiveMessage(message);
            message.markRead();
        } else {
            System.out.println("User is offline. Message pending...");
        }
    }
}
