class A extends Thread
{
public void run()
  {
    for(int i=0;i<3;i++)
    {
        System.out.println("Thread is running 1");
    }
    try 
    {
        Thread.sleep(1000);

    } 
    catch(Exception e) 
    {
        System.out.println(e);
    } 
  }   
}
class B extends Thread
{
public void run()
{
    for(int i=0;i<3;i++)
    {
        System.out.println("Thread is running - 2");
    }
    try 
    {
        Thread.sleep(1000);

    } 
    catch (Exception e) 
    {
        System.out.println(e);
    }
       
}
}
public class Is_Alive_Join
{
public static void main(String args[]) throws InterruptedException
{
    A a=new A();
    B b=new B();
    System.out.println(a.isAlive());

    a.start();
    b.start();
    System.out.println(a.isAlive());
    System.out.println(b.isAlive());
    
    try
    {
        b.join();
        a.join();
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }

}
}
