import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, LocalDateTime.now()));
        tickets.add(new Ticket(2,LocalDateTime.of(2026,3,17,11,40)));
        tickets.add(new Ticket(1, LocalDateTime.of(2026, 3, 17, 8, 00)));

        Collections.sort(tickets, new Comparator<Ticket>() {
            @Override
            public int compare(Ticket t1, Ticket t2) {
                return Integer.compare(t1.getPriority(), t2.getPriority());
            }
        });
        tickets.sort((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()));

        tickets.sort(Comparator.comparingInt(Ticket::getPriority));

        TicketSorter ticketSorter = new TicketSorter();
        System.out.println("Before sorting: " + tickets);
        ticketSorter.sortTickets(tickets, "priorityThenCreatedAt");
        System.out.println("After sorting: " + tickets);
    }
}
