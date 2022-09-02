package TaskNotepad.ExportImport;

import java.util.ArrayList;

import TaskNotepad.Model.Task;

public interface Saver {
    boolean save(ArrayList<Task> data, String path);
}
