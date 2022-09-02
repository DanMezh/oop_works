package Messanger.Users;

import Messanger.Chats.Chat;
import Messanger.Messages.EditableTimedMessage;
import Messanger.Messages.Message;
import Messanger.Messages.TimedMessage;

public class ChatViewer extends User {
    protected Chat chatroom;

    public Chat getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chat chatroom) {
        this.chatroom = chatroom;
    }

    public ChatViewer(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        chatroom.addUser(this);
    }

    public void printMessage(Message message) {
        if (message instanceof TimedMessage || message instanceof EditableTimedMessage) {
            TimedMessage thismessage = (TimedMessage) message;
            System.out.printf("Чат %s: (%s) %s\n", name, thismessage.getTime(), thismessage.getText());
        } else {
            System.out.printf("Чат %s: %s\n", name, message.getText());
        }
    }

}
