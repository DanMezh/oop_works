package TaskNotepad.ExportImport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import TaskNotepad.Model.Task;
import TaskNotepad.Model.TaskPriority;

public class CsvLoad implements Loader {

    @Override
    public ArrayList<Task> load(String path) {
        ArrayList<Task> tasks = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] splitedLine = line.split(",");
                if (splitedLine.length != 9) {
                    throw new IOException("Неправильное содержимое файла");
                }
                tasks.add(createTask(splitedLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return tasks;
        }
        return tasks;
    }

    private Task createTask(String[] splitedLine) {
        int id = Integer.parseInt(splitedLine[0]);
        String name = splitedLine[1];
        String description = splitedLine[2];
        TaskPriority priority = TaskPriority.valueOf(splitedLine[3]);
        LocalDateTime deadlineTime = splitedLine[4].equals("null") ? null : LocalDateTime.parse(splitedLine[4]);
        LocalDateTime createdDateTime = LocalDateTime.parse(splitedLine[5]);
        LocalDateTime lastUpdateDateTime = LocalDateTime.parse(splitedLine[6]);
        String creatorName = splitedLine[7];
        String lastUpdatorName = splitedLine[8];

        return new Task(id, name, description, priority, deadlineTime, createdDateTime, lastUpdateDateTime, creatorName,
                lastUpdatorName);
    }
}
