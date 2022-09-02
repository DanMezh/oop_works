package TaskNotepad.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import TaskNotepad.ExportImport.Loader;
import TaskNotepad.ExportImport.Saver;

public class ArrayListTaskRepo implements TaskRepo<Task> {
    ArrayList<Task> tasksList;

    public ArrayListTaskRepo() {
        this.tasksList = new ArrayList<>();
    }

    @Override
    public boolean save(Saver format, String path) {
        return format.save(tasksList, path);
    }

    @Override
    public boolean load(Loader format, String path) {
        if (format.load(path) != null) {
            this.tasksList = format.load(path);
            return true;
        }
        return false;
    }

    @Override
    public void add(Task task) {
        this.tasksList.add(task);
    }

    @Override
    public Task getById(int id) {
        for (Task task : this.tasksList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Task> getByName(String name) {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : this.tasksList) {
            if (task.getName().equals(name)) {
                result.add(task);
            }
        }
        if (result.isEmpty())
            return null;
        return result;
    }

    @Override
    public ArrayList<Task> getAll() { // возвращаем копию
        return tasksList;
    }

    @Override
    public void updateById(int id, Task task) {
        Task curTask = getById(id);
        curTask.setName(task.getName());
        curTask.setDescription(task.getDescription());
        curTask.setPriority(task.getPriority());
        curTask.setDeadlineTime(task.getDeadlineTime());
        curTask.setLastUpdateDateTime(LocalDateTime.now());
        curTask.setLastUpdatorName(ActiveUser.activeUserCopy().getFIO());
    }

    @Override
    public void removeById(int id) {
        tasksList.remove(getById(id));
    }
}
