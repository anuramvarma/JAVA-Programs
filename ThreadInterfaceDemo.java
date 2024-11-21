class Goodmorning implements Runnable 
{
    public void run() 
    {
        try 
        {
            for(int i = 1; i < 3; i++) 
            {
                System.out.println("Good Morning");
                Thread.sleep(170);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}
class Welcome implements Runnable 
{
    public void run() 
    {
        try 
        {
            for(int i = 1; i < 4; i++) 
            {
                System.out.println("Welcome");
                Thread.sleep(180);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}
class Hello implements Runnable 
{
    public void run() 
    {
        try {
            for(int i = 1; i < 5; i++) 
            {
                System.out.println("Hello");
                Thread.sleep(190);
            }
        } catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}
public class ThreadInterfaceDemo 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new Goodmorning());
        Thread t2 = new Thread(new Welcome());
        Thread t3 = new Thread(new Hello());
        t1.start();
        t2.start();
        t3.start();
    }
}
