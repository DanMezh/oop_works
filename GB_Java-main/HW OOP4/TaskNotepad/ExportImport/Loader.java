package TaskNotepad.ExportImport;

import java.util.ArrayList;

import TaskNotepad.Model.Task;

public interface Loader {
    ArrayList<Task> load(String path);
}
