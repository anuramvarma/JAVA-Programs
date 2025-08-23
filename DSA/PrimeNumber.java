import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number :");
        int n =sc.nextInt();
         int f=0;
         for (int i=2;i*i<n;i++){
            if(n%i==0){
                f++;
                break;
            }
         }
         if(f==0){
         System.out.println(n+" is a Prime Number");
         }
         else{
            System.out.println(n+" not a Prime number");
         }
    }
}
