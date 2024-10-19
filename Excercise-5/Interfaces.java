class Interfaces implements A,B
{
    public void Display()
    {
        System.out.println("Interface : A");
    }
    public void Display2()
    {
        System.out.println("Interface : B");
    }
        public static void main(String[] args)
        {
            Interfaces obj=new Interfaces();
               obj.Display();
               obj.Display2();              
        }
}
interface A
{
    void Display();
}
interface B
{
    void Display2();
}
