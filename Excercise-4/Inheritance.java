class A 
{
public void display() 
  {
	System.out.println("Parent class");
	}
}
class Inheritance extends A
{
public void run() 
  {
	System.out.println("child class");
	}
public static void main(String []args)
  {
	Inheritance obj = new Inheritance();
	obj.display();
	obj.run();
}
}
	
