package Messanger.Users;

import Messanger.Chats.Chat;

public class ChatAdmin extends ChatUser implements AdminRights {

    public ChatAdmin(User user, Chat chanel) {
        super(user.getName(), chanel);
    }

    public ChatAdmin(String name, Chat chanel) {
        super(name, chanel);
    }

    @Override
    public void removeUserByName(String name) {
        ChatViewer removedUser = (ChatViewer) chatroom.removeUserByName(name);
        if (removedUser != null) {
            removedUser.setChatroom(null);
        }
    }
}
