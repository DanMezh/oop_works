package Messanger.Messages;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimedMessage extends Message {
    private LocalTime timeCreated;

    public TimedMessage(String text) {
        super(text);
        this.timeCreated = LocalTime.now();
    }

    public String getTime() {
        return timeCreated.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
    }
}
