import java.util.Scanner;
public class BitStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bit stream (only 0s and 1s): ");
        String bit = sc.nextLine();
        int n=bit.length();
        StringBuilder stf = new StringBuilder();
        int count = 0;

        for (int i = 0; i <n; i++) {
            stf.append(bit.charAt(i));
            if (bit.charAt(i) == '1') {
                count++;
                if (count == 5) {
                    stf.append('0'); // insert 0 after five consecutive 1s
                    count = 0; // reset the counter
                }
            } else {
                count = 0; // reset if 0 is encountered
            }
        }
        System.out.println("Bit Stuffed output: " + stf);
        sc.close();
    }
}