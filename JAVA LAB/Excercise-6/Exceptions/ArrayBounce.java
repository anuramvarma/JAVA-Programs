class ArrayBounce
{
    public static void main(String[] args) 
    {
        try 
        {
            int a[]={1,3,5,9,11};
            System.out.println(a[10]);
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
