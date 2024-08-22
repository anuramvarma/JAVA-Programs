public class Method_Overloading
{
   static void display()
{
   System.out.println("Hello,Varma");
}
  static int display(int n)
{
  return n;
}
  public static void main(String []args)
  {
    display();
    System.out.println(display(2));
  }
}
