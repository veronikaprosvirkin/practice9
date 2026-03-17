public class TicketManager {
    public String buildTicketId(String base){
        String prefix = "TIX-";
        //local class
        class IdBuilder{
            String create(){
                return prefix + base.toUpperCase() + "-" + System.currentTimeMillis();
            }
        }
        IdBuilder builder = new IdBuilder();
        return builder.create();
    }
}
