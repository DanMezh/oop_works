package TaskNotepad.Model;

public abstract class ActiveUser {
    private static Person activeUser;

    public static void setActiveUser(Person activeUser) {
        ActiveUser.activeUser = activeUser;
    }

    public static Person activeUserCopy() { // возращаем клона текущего пользователя
        Person clone = new Person(activeUser.firstName, activeUser.patronimyc, activeUser.lastName);
        return clone;
    }
}
