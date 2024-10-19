import java.io.*;
class Writting_Data
{
public static void main(String[]args) throws FileNotFoundException,IOException
{
FileOutputStream fos=new FileOutputStream("bcd.txt");
fos.write(10);
System.out.println("...Successfully Written...");
fos.flush();
fos.close();
}
}
