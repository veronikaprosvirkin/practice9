public class TaskRunner {
    public Runnable runOnce(){
        String message = "Task is running";

        //anonymous class
        return new Runnable(){
            @Override
            public void run (){
                System.out.println(message);
            }
        };
    }
}
