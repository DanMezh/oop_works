package Messanger.Chats;

import Messanger.Users.User;

public class ArrayListChatUsersRepo extends ArrayListRepo<User> {

    @Override
    public User getByName(String name) {
        for (User user : repo) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User removeByName(String name) {
        User removedUser = getByName(name);
        if (repo.remove(removedUser)) {
            return removedUser;
        }
        return null;
    }
}
