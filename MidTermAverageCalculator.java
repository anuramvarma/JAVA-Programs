import java.util.*;
public class MidTermAverageCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] midTerm1 = new int[5];
        int[] midTerm2 = new int[5];
        int[] finalAverage = new int[5];
        String[] subjects = {"DM&GT", "UHV", "DLCO", "DBMS", "OOPJ"};
        // Step 1 & 2: Take Mid Term - 1 marks and store them
        System.out.println("Enter Mid Term - 1 marks for 5 subjects:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(subjects[i] + ": ");
            midTerm1[i] = scanner.nextInt();
        }
        // Step 3: Take Mid Term - 2 marks and store them
        System.out.println("Enter Mid Term - 2 marks for 5 subjects:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(subjects[i] + ": ");
            midTerm2[i] = scanner.nextInt();
        }
        // Step 4 & 5: Calculate average for each subject using the formula
        System.out.println("\nFinal Average for each subject:");
        for (int i = 0; i < 5; i++) 
        {
            int maxMid = Math.max(midTerm1[i], midTerm2[i]);
            int minMid = Math.min(midTerm1[i], midTerm2[i]);
            finalAverage[i] = (int) Math.round(0.8 * maxMid + 0.2 * minMid); // Step 6: Round off to nearest ones
            System.out.printf("%s: %d\n", subjects[i], finalAverage[i]);
        }
        scanner.close();
    }
}

