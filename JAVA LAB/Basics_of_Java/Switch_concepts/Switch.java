import java.util.Scanner;
public class Switch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        double b = sc.nextInt();
        System.out.println("Choose an Arthimatic operation:");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        int choice = sc.nextInt();
        switch(choice) 
        {
            case 1:
                System.out.println("Addition : " +(a+b));
                    break;
            case 2:
                System.out.println("Substraction : " +(a-b));
                    break;
            case 3:
                System.out.println("Multiplication: " +(a*b));
                    break;
            case 4:
                if (b!= 0) 
                {
                    System.out.println("Division: " +(a/b));
                } 
                else 
                {
                    System.out.println("Division by zero is not allowed.");
                }
                    break;
            default:System.out.println("Invalid choice....! - Please select a valid operation.");
                    break;
        }
    }
}


