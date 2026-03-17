import java.time.LocalDateTime;

public class Ticket {
    private int priority;
    private LocalDateTime createdAt;

    public Ticket(int priority, LocalDateTime createdAt) {
        this.priority = priority;
        this.createdAt = createdAt;
    }

    public int getPriority() { return priority; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Ticket{prio=" + priority + ", date=" + createdAt + "}";
    }
}
