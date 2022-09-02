package Messanger.Messages;

public class EditableTimedMessage extends TimedMessage implements Editable {

    public EditableTimedMessage(String text) {
        super(text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
