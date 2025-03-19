import java.util.*;

public class CodeVita {

    class Pair{
        int row, col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    static class ChalMereSathi implements Comparable<ChalMereSathi> {
        int row, col, time, strength;

        ChalMereSathi(int row, int col, int time, int strength) {
            this.row = row;
            this.col = col;
            this.time = time;
            this.strength = strength;
        }

        @Override
        public int compareTo(ChalMereSathi other) {
            return Integer.compare(this.time, other.time);
        }
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Read shark strengths and find source/destination
        int[][] sharkKITaakatPositionKSaath = new int[N][M];
        int HariKStartKaX = -1;
        int HariKStartKaY = -1;
        int HariKEndKaX = -1 ;
        int HariKEndKaY = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                String cell = sc.next();
                if (cell.equals("S")) {
                    HariKStartKaX = i;
                    HariKStartKaY = j;

                    sharkKITaakatPositionKSaath[i][j] = 0;
                } else if (cell.equals("D")) {
                    HariKEndKaX = i;
                    HariKEndKaY = j;
                    sharkKITaakatPositionKSaath[i][j] = 0;
                } else {
                    sharkKITaakatPositionKSaath[i][j] = Integer.parseInt(cell);
                }
            }
        }

        // Read time matrix
        int[][] samayPositionKSaath = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                samayPositionKSaath[i][j] = sc.nextInt();
            }
        }

        // Read initial strength
        int HariKiTaakat = sc.nextInt();

        // Find optimal path
        ChalMereSathi result = function(N, M, sharkKITaakatPositionKSaath, samayPositionKSaath, HariKStartKaX, HariKStartKaY, HariKEndKaX, HariKEndKaY, HariKiTaakat);

        if (result == null) {
            System.out.println("Not Possible");
        } else {
            System.out.println(result.time + " " + result.strength);
        }

        sc.close();
    }

    private static ChalMereSathi function(int N, int M, int[][] sharkKITaakatPositionKSaath, int[][] samayPositionKSaath,
                                         int HariKStartKaX, int HariKStartKaY, int HariKEndKaX, int HariKEndKaY, int HariKiTaakat) {
        // Priority queue to get path with minimum time
        PriorityQueue<ChalMereSathi> yeHaiTimeSeComparekarneWaliQueue = new PriorityQueue<>();
        // Visited array to track maximum strength at each position for given time
        boolean[][][] visited = new boolean[N][M][10001]; // 10001 for max possible strength

        yeHaiTimeSeComparekarneWaliQueue.offer(new ChalMereSathi(HariKStartKaX, HariKStartKaY, 0, HariKiTaakat));

        while (!yeHaiTimeSeComparekarneWaliQueue.isEmpty()) {
            ChalMereSathi curr = yeHaiTimeSeComparekarneWaliQueue.poll();

            // If reached destination
            if (curr.row == HariKEndKaX && curr.col == HariKEndKaY) {
                return curr;
            }

            // If strength is already negative, skip
            if (curr.strength < 0) continue;

            // If this state was already visited with better strength, skip
            if (visited[curr.row][curr.col][curr.strength]) continue;
            visited[curr.row][curr.col][curr.strength] = true;

            // Try all four directions
            for (int i = 0; i < 4; i++) {
                int newRow = curr.row + dx[i];
                int newCol = curr.col + dy[i];

                if (newRow >= 0 && newRow < N && newCol >= 0 && newCol < M) {
                    // Calculate new strength after fighting shark and moving
                    int newStrength = curr.strength - sharkKITaakatPositionKSaath[newRow][newCol] - 1;

                    // If strength is sufficient to fight shark
                    if (newStrength >= 0) {
                        int newTime = curr.time + samayPositionKSaath[newRow][newCol];
                        yeHaiTimeSeComparekarneWaliQueue.offer(new ChalMereSathi(newRow, newCol, newTime, newStrength));
                    }
                }
            }
        }

        return null; // No possible path found
    }
}