package TaskNotepad.Model;

public enum TaskPriority {
    IMMEDIATE("Немедленный"),
    MEDIUM("Средний"),
    LOW("Низкий");
    
    String name;

    private TaskPriority(String str){
        this.name = str;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}