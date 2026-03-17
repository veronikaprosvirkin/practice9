import java.util.Comparator;

public class TicketComparators {
    public static final Comparator<Ticket> BY_PRIORITY =
            Comparator.comparingInt(Ticket::getPriority);

    public static final Comparator<Ticket> BY_CREATED_AT =
            Comparator.comparing(Ticket::getCreatedAt);

    public static final Comparator<Ticket> BY_PRIORITY_THEN_DATE =
            BY_PRIORITY.thenComparing(BY_CREATED_AT);
}