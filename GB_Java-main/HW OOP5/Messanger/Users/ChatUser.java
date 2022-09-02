package Messanger.Users;

import Messanger.Chats.Chat;
import Messanger.Messages.EditableMessage;
import Messanger.Messages.EditableTimedMessage;
import Messanger.Messages.Message;

public class ChatUser extends ChatViewer implements TalkRights {

    public ChatUser(String name, Chat chanel) {
        super(name, chanel);
    }

    @Override
    public void sendMessage(String text) {
        if (chatroom == null) {
            return;
        }
        Message message = new EditableTimedMessage(text);
        chatroom.sendMessage(message, this);
    }

    public void sendNonTimedMessage(String text) {
        if (chatroom == null) {
            return;
        }
        Message message = new EditableMessage(text);
        chatroom.sendMessage(message, this);
    }

}
