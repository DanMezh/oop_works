package Messanger.Messages;

public class EditableMessage extends Message implements Editable {

    public EditableMessage(String text) {
        super(text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
