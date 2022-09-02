package Messanger.Messages;

public abstract class Message {
    protected String text;

    public String getText() {
        return text;
    }

    public Message(String text) {
        this.text = text;
    }
}
