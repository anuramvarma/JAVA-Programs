class MyRunnable implements Runnable 
{ 
    private String threadName; 
    public MyRunnable(String threadName) 
    { 
        this.threadName = threadName; 
    } 
    public void run() 
    { 
        for (int i = 0;i<3;i++) 
        { 
            System.out.println(threadName + " is running, Iteration: " + i); 
            try 
            { 
                Thread.sleep(150); // Sleep for 150 milliseconds 
            } 
            catch (InterruptedException e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
} 
public class Thread_Priority 
{ 
    public static void main(String[] args) 
    { 
        // Create runnable instances 
        MyRunnable r1 = new MyRunnable("Thread-1"); 
        MyRunnable r2 = new MyRunnable("Thread-2"); 
        MyRunnable r3 = new MyRunnable("Thread-3"); 
        // Create threads 
        Thread t1 = new Thread(r1); 
        Thread t2 = new Thread(r2); 
        Thread t3 = new Thread(r3); 
        // Set thread priorities 
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1 
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default) 
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10 
        // Start threads 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
} 
