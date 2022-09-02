import TaskNotepad.Model.ArrayListTaskRepo;
import TaskNotepad.Model.Task;
import TaskNotepad.Model.TaskRepo;
import TaskNotepad.Presenter.Presenter;
import TaskNotepad.View.ConsoleView;
import TaskNotepad.View.View;

public class Start {

    public static void main(String[] args) {
        Presenter<TaskRepo<Task>, View> p1 = new Presenter<TaskRepo<Task>, View>(new ArrayListTaskRepo(),
                new ConsoleView());

        p1.start();
    }
}