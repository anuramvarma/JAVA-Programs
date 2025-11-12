class Runtime_Polymorphism 
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.msg();

    }
}
class A
{
    void msg()
    {
        System.out.println("This is Class A --");
    }
}
class B
{
    void msg()
    {
        System.out.println("This is Class B --");
    }
}

