import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketSorter {

    public void sortTickets(List<Ticket> tickets, String strategy) {
        Comparator<Ticket> comparator = switch (strategy) {
            case "priority" -> TicketComparators.BY_PRIORITY;
            case "createdAt" -> TicketComparators.BY_CREATED_AT;
            case "priorityThenCreatedAt" -> TicketComparators.BY_PRIORITY_THEN_DATE;
            default -> throw new IllegalArgumentException("Unknown strategy: " + strategy);
        };
        tickets.sort(comparator);
    }

}