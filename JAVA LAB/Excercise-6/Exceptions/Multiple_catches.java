public class Multiple_catches 
{
    public static void main(String[] args) 
{
        try 
         {
            int a=10/0;
            System.out.println(a);
         } 
        catch (ArithmeticException e) 
         {
            System.out.println("Arithematic exception");
         }
        catch (ArrayIndexOutOfBoundsException e) 
         {
            System.out.println("Array out of bound exception");
         }
        catch (NullPointerException e)
         {
            System.out.println("Null pointer exception");
         }
    }
}
