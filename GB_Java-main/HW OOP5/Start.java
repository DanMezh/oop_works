import Messanger.Chats.ArrayListChatUsersRepo;
import Messanger.Chats.ChatChanel;
import Messanger.Users.ChatAdmin;
import Messanger.Users.ChatUser;
import Messanger.Users.ChatViewer;

/**
 * Start
 */
public class Start {

    public static void main(String[] args) {
        ChatChanel chanel = new ChatChanel(new ArrayListChatUsersRepo());

        ChatUser user1 = new ChatUser("ChatUser1", chanel);
        ChatUser user2 = new ChatUser("ChatUser2", chanel);
        ChatViewer viewer1 = new ChatViewer("Chatviewer1", chanel);
        ChatAdmin admin1 = new ChatAdmin("admin1", chanel);

        System.out.println("**User1 says message**");
        user1.sendMessage("Hello all");
        System.out.println("----------------------");
        System.out.println("**Admin1 says message**");
        admin1.sendMessage("Prepearing to remove user2");
        System.out.println("----------------------");
        System.out.println("**User2 says message**");
        user2.sendMessage("Hello");
        System.out.println("----------------------");
        System.out.println("**Admin1 removed user2**");
        admin1.removeUserByName("ChatUser2");
        admin1.sendNonTimedMessage("Removed User2");
        System.out.println("----------------------");
        System.out.println("**User2 try to say message**");
        user2.sendMessage("Hey?");
        System.out.println("----------------------");
        System.out.println("**Admin1 say message**");
        admin1.sendMessage("He is gone");
        System.out.println("----------------------");
    }
}
