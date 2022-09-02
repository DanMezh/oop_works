package TaskNotepad.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String name;
    private String description;
    private TaskPriority priority;

    private LocalDateTime deadlineTime;
    private LocalDateTime createdDateTime;
    private LocalDateTime lastUpdateDateTime;

    private String creatorName;
    private String lastUpdatorName;

    /**
     * Конструктор для закругзурки при импорте
     * 
     * @param id
     * @param name
     * @param description
     * @param priority
     * @param deadlineTime
     * @param createdDateTime
     * @param lastUpdateDateTime
     * @param creatorName
     * @param lastUpdatorName
     */
    public Task(int id, String name, String description, TaskPriority priority, LocalDateTime deadlineTime,
            LocalDateTime createdDateTime, LocalDateTime lastUpdateDateTime, String creatorName,
            String lastUpdatorName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadlineTime = deadlineTime;
        this.createdDateTime = createdDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.creatorName = creatorName;
        this.lastUpdatorName = lastUpdatorName;
    }

    /**
     * Базовые конструктор задач (при создании задач)
     * 
     * @param name         - имя (обязательно для создания)
     * @param description  - описание (По умолчанию: "")
     * @param taskPriority - уровень приоритета (По умолчанию: TaskPriority.LOW)
     * @param deadlineTime - крайний срок задачи (По умолчанию: null - т.е. задача
     *                     бессрочная)
     */
    public Task(String name, String description, TaskPriority taskPriority, LocalDateTime deadlineTime,
            String creatorName) {
        this.id = TaskId.nextId();
        this.name = name;
        this.description = description;
        this.priority = taskPriority;
        this.createdDateTime = LocalDateTime.now();
        this.lastUpdateDateTime = this.createdDateTime;
        this.creatorName = creatorName;
        this.lastUpdatorName = this.creatorName;
        this.deadlineTime = deadlineTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority taskPriority) {
        this.priority = taskPriority;
    }

    public LocalDateTime getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(LocalDateTime deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(LocalDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public String getLastUpdatorName() {
        return lastUpdatorName;
    }

    public void setLastUpdatorName(String lastUpdatorName) {
        this.lastUpdatorName = lastUpdatorName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:")
                .append(id)
                .append("; Имя: ")
                .append(name)
                .append("; Описание: ")
                .append(description)
                .append("; Приоритет: ")
                .append(priority)
                .append("; Дата создания: ")
                .append(createdDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS")).toString())
                .append("; Крайний срок: ")
                .append(deadlineTime == null ? "Не определён"
                        : deadlineTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")).toString())
                .append("; Автор: ")
                .append(creatorName);
        return sb.toString();
    }
}