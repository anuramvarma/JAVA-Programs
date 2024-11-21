class Hello
{
    void display()
    {
        System.out.println("Hello");
    }
}
class Method_Overriding extends Hello
{
    void display2()
    {
        System.out.println("AnuramVarma !");
    }

    public static void main(String[] args)
    {
        Method_Overriding obj= new Method_Overriding();
        obj.display();
        obj.display2();

    }
}
