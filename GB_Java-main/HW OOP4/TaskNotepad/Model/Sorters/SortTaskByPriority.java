package TaskNotepad.Model.Sorters;

import java.util.Comparator;

import TaskNotepad.Model.Task;

public class SortTaskByPriority implements Comparator<Task>{

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getPriority().compareTo(o2.getPriority());
    }
    
}
