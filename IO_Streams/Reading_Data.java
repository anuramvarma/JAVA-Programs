import java.io.*;
class Reading_Data
{
  public static void main(String[]args) throws FileNotFoundException,IOException
{
  FileInputStream fis = new FileInputStream("abc.txt");
  int data;
   while((data=fis.read())!= -1)
   {	
     System.out.println("data:"+ (char)data);
   }
   fis.close();
 }
}
