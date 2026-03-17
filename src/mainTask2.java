public class mainTask2 {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        String ticketId = ticketManager.buildTicketId("SMTH");
        System.out.println("Generated tickets id " + ticketId);

        TaskRunner taskRunner = new TaskRunner();
        Runnable task = taskRunner.runOnce();
        System.out.println("Result of taskRunner: ");
        task.run();
    }
}
