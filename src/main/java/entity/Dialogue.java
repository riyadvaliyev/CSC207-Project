package entity;

import java.util.ArrayList;

public class Dialogue {

    final int dialogueId;
    private ArrayList<Message> messages;
    final User[] dialogueUsers;

    public Dialogue(int dialogueId, User user1, User user2){
        this.dialogueId = dialogueId;
        this.dialogueUsers = new User[]{user1, user2};
        this.messages = new ArrayList<>();
    }
    public void addMessage(Message message){
        messages.add(message);
    }

    public int getDialogueId() {
        return dialogueId;
    }
}
