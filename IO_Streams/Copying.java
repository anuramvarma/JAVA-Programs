import java.io.*;
class Copy
{
    public static void main(String[]args) throws FileNotFoundException,IOException
    {
        FileInputStream fis=new FileInputStream("Anuram.txt");
        FileOutputStream fos=new FileOutputStream("Varma.pdf");
        int data;
            while((data=fis.read())!=-1)
                {
                    fos.write(data);
                }
        System.out.println("File Copied To your New Location ");
        fis.close();
        fos.flush();
        fos.close();
    }
}
