package Messanger.Chats;

import Messanger.Messages.Message;
import Messanger.Users.ChatViewer;
import Messanger.Users.User;

public class ChatChanel implements Chat {
    private Repository<User> repository;

    public ChatChanel(ArrayListChatUsersRepo arrayListChatUsersRepo) {
        this.repository = arrayListChatUsersRepo;
    }

    @Override
    public void sendMessage(Message message, User sender) {
        for (int i = 0; i < repository.getCount(); i++) {
            ChatViewer user = (ChatViewer) repository.getByIndex(i);
            if (!user.getName().equals(sender.getName())) {
                user.printMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        repository.add(user);
    }

    @Override
    public User removeUserByName(String name) {
        return repository.removeByName(name);
    }
}
