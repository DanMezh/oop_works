package TaskNotepad.ExportImport;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import TaskNotepad.Model.Task;

public class CsvSave implements Saver {

    @Override
    public boolean save(ArrayList<Task> data, String path) {
        try (PrintWriter printWriter = new PrintWriter(path)) {
            for (Task task : data) {
                int id = task.getId();
                String Name = task.getName();
                String description = task.getDescription();
                String priority = task.getPriority().name();
                String deadLineDateTime = task.getDeadlineTime() == null ? "null" : task.getDeadlineTime().toString();
                String addingDateTime = task.getCreatedDateTime().toString();
                String lastUpdateDateTime = task.getLastUpdateDateTime().toString();
                String authorName = task.getCreatorName();
                String lastUpdatorName = task.getLastUpdatorName();
                printWriter.printf("%d,%s,%s,%s,%s,%s,%s,%s,%s\r\n",
                        id,
                        Name,
                        description,
                        priority,
                        deadLineDateTime,
                        addingDateTime,
                        lastUpdateDateTime,
                        authorName,
                        lastUpdatorName);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
