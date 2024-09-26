abstract class Shape 
{   
    abstract double Area();
}
class Circle extends Shape 
{
    double r;
    Circle(double r) 
    {
        this.r = r;
    } 
    double Area() 
    {
        return 3.14 *r* r;
    }
}

class Rectangle extends Shape 
{
    int l, w;
    Rectangle(int l,int w) 
    {
        this.l= l;
        this.w= w;
    }
    double Area() 
    {
        return l*w;
    }
}

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius=");
        r=sc.nextDouble();
        System.out.println("Enter length and width of rectangle =");
      
        l=nextInt();
        w=nextInt();
 
        Shape circle = new Circle(r);
        Shape rectangle = new Rectangle(l,w);
        System.out.println("Area of Circle=" + circle.Area());
        System.out.println("Area of Rectangle=" + rectangle.Area());
    }
}
