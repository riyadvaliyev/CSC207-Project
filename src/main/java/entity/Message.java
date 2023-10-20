package entity;

public class Message {
    private int messageId;

    private String content;

    private User sender;
    private User receiver;

    public Message(int messageId, String content, User sender, User receiver){
        this.messageId = messageId;
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }
}
