package Messanger.Chats;

interface Repository<T> {
    void add(T user);

    T getByName(String name);

    T getByIndex(int index);

    void removeByIndex(int index);

    T removeByName(String name);

    int getCount();
}
