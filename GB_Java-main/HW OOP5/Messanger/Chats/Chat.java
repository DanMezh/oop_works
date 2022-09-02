package Messanger.Chats;

import Messanger.Messages.Message;
import Messanger.Users.User;

public interface Chat {
    void sendMessage(Message message, User sender);

    void addUser(User user);

    User removeUserByName(String Name);
}
