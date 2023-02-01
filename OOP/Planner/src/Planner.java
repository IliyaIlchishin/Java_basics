
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Planner<T> {

    // основные параметры задачи

    private T subject;
    private String author;
    private String addTime;
    private String addDate;
    private int priority;

    private String Deadline;
    private int id;
    private T data;

    private static int count;

    static {
        count = 0;
    }

    /**
     * Конструктор задачи
     *
     * @param subject   Тема задачи
     * @param author    Автор
     * @param priority  Приоритет задачи
     * @param Deadline  дата завершения
     *
     * текущие время и дата заносчтся без участия пользователя
     *
     */

    public Planner(T subject, String author, int priority, String Deadline) {
        this.subject = subject;
        this.author = author;
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.priority = priority;
        this.Deadline = Deadline;
        this.id = ++count;
    }

    public Planner() {

    }

    public T getSubject() {
        return subject;
    }

    public void setSubject(T subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddTime() {
        return addTime;
    }

    public String getAddDate() {
        return addDate;
    }

    public String Deadline() {
        return Deadline;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void SetDeadline (String Deadline) {
        this.Deadline = Deadline;
    }

    @Override
    public String toString() {
        return "\nid -" + getId() + ", тема - " + getSubject() +
                ", автор: " + getAuthor() +
                "\nвремя добавления: " + addTime +
                ", дата добавления: " + addDate +
                ", дедлайн: " + Deadline +
                ", важность: " + getPriority();
    }


}
