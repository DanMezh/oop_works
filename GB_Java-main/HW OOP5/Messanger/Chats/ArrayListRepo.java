package Messanger.Chats;

import java.util.ArrayList;

public abstract class ArrayListRepo<T> implements Repository<T> {
    protected ArrayList<T> repo = new ArrayList<>();

    @Override
    public void add(T user) {
        repo.add(user);
    }

    @Override
    public T getByIndex(int index) {
        return repo.get(index);
    }

    @Override
    public int getCount() {
        return repo.size();
    }

    @Override
    public void removeByIndex(int index) {
        repo.remove(index);
    }
}
