
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
    }

    public static void pattern1(int n) {
        System.out.println("----Pattern 1 ----");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern2(int n) {
        System.out.println("----Pattern 2 :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern3(int n) {
        System.out.println("----Pattern 3 ----");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern4(int n) {
        System.out.println("----Pattern 4 ----");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern5(int n) {
        System.out.println("----Pattern 5 ----");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern6(int n) {
        System.out.println("----Pattern 6 ----");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
public static void pattern7(int n) {
    System.out.println("----Pattern 7 ----");
    for (int i = 0; i < n; i++) {
        // Space
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Star
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        //space
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
        }
    }
}
