import java.util.Random;
import java.util.Scanner;
class GoBackNProtocol {
    private static final int MAX_FRAMES = 10;
    private static final int WINDOW_SIZE = 2;
    // Simulate 20% chance of frame loss
    private static boolean isFrameLost(Random rand) {
        return rand.nextInt(5) == 0; // 1 in 5 chance
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter total number of frames to send (max " + MAX_FRAMES + "): ");
        int totalFrames = sc.nextInt();

        if (totalFrames <= 0 || totalFrames > MAX_FRAMES) {
            System.out.println("Invalid number of frames!");
            return;
        }

        System.out.println("\n--- Go-Back-N Sliding Window Protocol Simulation ---");
        System.out.println("Window Size : " + WINDOW_SIZE);
        System.out.println("-----------------------------------------------");

        int sent = 0, ack = 0;

        while (ack < totalFrames) {
            int toSend = Math.min(WINDOW_SIZE, totalFrames - sent);

            System.out.print("\nSender Window: [ ");
            for (int i = 0; i < toSend; i++)
                System.out.print((sent + i + 1) + " ");
            System.out.println("]");

            int errorIndex = -1;

            // Sending frames
            for (int i = 0; i < toSend; i++) {
                Thread.sleep(500); // simulate delay
                if (isFrameLost(rand)) {
                    System.out.println("Frame " + (sent + i + 1) + " lost during transmission!");
                    errorIndex = i;
                    break;
                } 
                else {
                    System.out.println("Frame " + (sent + i + 1) + " sent successfully.");
                }
            }

            // Receiver side logic
            if (errorIndex == -1) {
                System.out.println("📩 Receiver: ACK for all " + toSend + " frames received successfully.");
                sent += toSend;
                ack += toSend;
            } else {
                System.out.println("⚠️ Receiver: NO-ACK for frame " + (sent + errorIndex + 1) 
                + ". Go-Back-N triggered!");
                System.out.println("↩️  Receiver discards all frames from " + (sent + errorIndex + 1) 
                + " onwards.");
                sent += errorIndex; // Go back to the lost frame
                ack += errorIndex;
            }
        }

        System.out.println("\n✅ All frames sent and acknowledged successfully!");
        System.out.println("------------------------------------------");
        sc.close();
    }
}
