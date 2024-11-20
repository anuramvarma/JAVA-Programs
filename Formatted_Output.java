public class Formatted_Output 
{
    public static void main(String[] args) 
    {
        // Print a simple message
        System.out.printf("Hello, %s!%n", "World");

        int num = 123;
        System.out.printf("Number: %d\n",num);

        double price = 19.99;
        System.out.printf("Price: %.2f%n", price);
      
        String str ="Anuram ";
        System.out.printf("String : %s\n",str);
      
        char ch='C';
        System.out.printf("Character : %c\n",ch);
    }
}
