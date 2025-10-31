import java.util.Scanner;
public class LeakyBucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucketCapacity, outputRate, n;
        int[] inputPackets = new int[50];
        int currentBucket = 0;

        System.out.print("Enter bucket capacity: ");
        bucketCapacity = sc.nextInt();

        System.out.print("Enter output rate: ");
        outputRate = sc.nextInt();

        System.out.print("Enter number of time intervals: ");
        n = sc.nextInt();

        System.out.println("Enter number of packets arriving at each interval:");
        for (int i = 0; i < n; i++) {
            inputPackets[i] = sc.nextInt();
        }

        System.out.println("\nTime\tPackets Incoming\tPackets Sent\tPackets Left\tPackets Dropped");

        for (int i = 0; i < n; i++) {
            int incoming = inputPackets[i];
            int dropped = 0;

            // Check for overflow
            if (incoming + currentBucket > bucketCapacity) {
                dropped = (incoming + currentBucket) - bucketCapacity;
                currentBucket = bucketCapacity;
            } else {
                currentBucket += incoming;
            }

            // Packets sent this interval = output rate or remaining packets
            int sent = Math.min(outputRate, currentBucket);
            currentBucket -= sent;

            System.out.printf("%d\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\n",
                    (i + 1), incoming, sent, currentBucket, dropped);
        }
        sc.close();
    }
}