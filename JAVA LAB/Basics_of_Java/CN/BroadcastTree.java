import java.util.Scanner;
public class BroadcastTree {
    static final int INF = 9999;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Hosts: ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];
        int totalCost = 0;
    System.out.println("Enter adjacency matrix ("+ n + "x" + n + "):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                graph[i][j] = sc.nextInt();
        visited[0] = true;
        System.out.println("\nEdges in the broadcast tree:");
        for (int edges = 0; edges < n - 1; edges++) {
            int min = INF, u = -1, v = -1;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && graph[i][j] < min && graph[i][j] != 0) {
                            min = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }
            visited[v] = true;
            totalCost += min;
            System.out.printf("Host %d - Host %d : Cost = %d\n", u, v, min);
        }
        System.out.println("Total cost of Broadcast Tree: " + totalCost);
    }
}
