public class Constructor_overloading
{
   Constructor_overloading() 
    {
      System.out.println("Hello,Anuram");
     }
Constructor_overloading(int a ,int b)
  {
     System.out.println(a+b);
  }
  public static void main(String []args)
   {
   	Constructor_overloading obj1 = new Constructor_overloading();
  	Constructor_overloading obj2 = new Constructor_overloading(6,9);
   }
}
