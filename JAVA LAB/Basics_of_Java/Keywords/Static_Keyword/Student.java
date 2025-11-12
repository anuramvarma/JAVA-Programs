//Static_Keyword
class Student
{
  int rollno;
  String name;
  static String college="VITB";
  Student(int r, String n)
    {
       rollno = r;
       name = n;
     }
    void display()
     {
        System.out.println(rollno+" "+name+" "+college);
     }
            public static void main(String args[])
            {
                Student s1 = new Student(369,"Anuram"); 
                 Student s2 = new Student(963,"Varma");
                     s1.display();
                     s2.display();
            }
}
