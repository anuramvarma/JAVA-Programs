//Bank Account
import java.util.Scanner;

public class BankAccount {
    private static int runningAccountNo = 0;
    private String name;
    private int accountNo;
    private int balance;
    public static void initializeNumber(int startingAccountNo) {
        runningAccountNo = startingAccountNo;
    }
    public BankAccount(String name) {
        this.name = name;
        this.accountNo = runningAccountNo++;
        this.balance = 0;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (balance - amount < 0) {
                System.out.println("Negative Balance Transaction Cancelled");
            } else {
                balance -= amount;
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    public void display() {
        System.out.print(accountNo+ " ");
        System.out.print(name+" ");
        System.out.println(balance+" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingAccountNo = scanner.nextInt();
        scanner.nextLine();  
        String name = scanner.nextLine();
        BankAccount.initializeNumber(startingAccountNo);
      BankAccount account = new BankAccount(name);

        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] transaction = scanner.nextLine().split(" ");
            String command = transaction[0];

            switch (command) {
                case "Deposit":
                    int depositAmount = Integer.parseInt(transaction[1]);
                    account.deposit(depositAmount);
                    break;

                case "Withdraw":
                    int withdrawAmount = Integer.parseInt(transaction[1]);
                    account.withdraw(withdrawAmount);
                    break;

                case "Display":
                    account.display();
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}
//Class and objects 9
import java.util.Scanner;

class Person {
    private int age;

  
    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

   
    public void yearPasses() {
        this.age++;
    }

 
    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

//Dog inheritance
import java.io.*;
import java.util.*;
 class Dog {
    private String name;
    private String color;
    private int weight;

   
    public Dog(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
 class Greyhound extends Dog {

    public Greyhound(String name, String color, int weight) {
        super(name, color, weight);  // Initialize the Dog properties
    }


    public String toString() {
     
        return getName() + " is " + getColor() + " in color and his weight is " + getWeight() + "Kg";
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();  
        String color = in.nextLine();  
        int weight = in.nextInt();  
        Greyhound pup = new Greyhound(name, color, weight);  

        System.out.println(pup.getName());
        System.out.println(pup.getColor());
        System.out.println(pup.getWeight());
        System.out.println(pup);  
        System.out.println("Superclass:" + pup.getClass().getSuperclass().getName());
    }
}
