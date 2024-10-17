class Null_Pointer
{
    public static void main(String[] args) 
    {
        try 
        {
            String a=null;
            System.out.println(a.length());
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}
