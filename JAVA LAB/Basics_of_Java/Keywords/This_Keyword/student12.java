class 
{
    int id;
    String name;
 student2(int id, String name)
    {
         this.id = id;
         this.name = name;
     }
 void display()
     {
        System.out.println(id+" "+name);
     }
public static void main(String args[])
     {
         student12 s1 = new student12(136, "Anuram");
         student12 s2 = new student12(964, "Varma");
            s1.display();
            s2.display();
     }
} 
