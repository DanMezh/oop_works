package TaskNotepad.Model.Sorters;

import java.time.LocalDateTime;
import java.util.Comparator;

import TaskNotepad.Model.Task;

public class SortTaskByDeadlineTime implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        LocalDateTime timeO1 = o1.getDeadlineTime();
        LocalDateTime timeO2 = o2.getDeadlineTime();
        if (timeO1 == null && timeO2 == null) {
            return 0;
        }
        if (timeO1 == null) {
            return 1;
        }
        if (timeO2 == null) {
            return -1;
        }
        return timeO1.compareTo(timeO2);
    }
}