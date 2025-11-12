class Arithmetic_Exceptions
{
    public static void main(String[] args) 
    {
        try 
        {
            int a=15/0;
            System.out.println(a);
        } 
        catch(Exception e) 
          {
            System.out.println(e);
          }
    }
}
