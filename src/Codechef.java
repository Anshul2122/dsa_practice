import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());
        // your code goes here
        while (T-- > 0) {
            // Read the number of cards
            int N = Integer.parseInt(br.readLine());

            // Read the front values (A array)
            int[] A = new int[N];
            String[] aInput = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(aInput[i]);
            }

            // Read the back values (B array)
            int[] B = new int[N];
            String[] bInput = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(bInput[i]);
            }

            // Find the maximum A value and its index
            int maxA = -1, maxIndex = -1;
            for (int i = 0; i < N; i++) {
                if (A[i] > maxA) {
                    maxA = A[i];
                    maxIndex = i;
                }
            }

            // Find the second maximum A value (ignoring the card Alice will remove)
            int secondMaxA = -1;
            for (int i = 0; i < N; i++) {
                if (i != maxIndex) {
                    secondMaxA = Math.max(secondMaxA, A[i]);
                }
            }

            // Check if Alice can win
            boolean canAliceWin = false;
            for (int i = 0; i < N; i++) {
                int bobMaxA = (i == maxIndex) ? secondMaxA : maxA; // Bob's choice
                if (Math.max(A[i], B[i]) > Math.max(bobMaxA, B[maxIndex])) {
                    canAliceWin = true;
                    break;
                }
            }

            // Append result for this test case
            sb.append(canAliceWin ? "Yes" : "No").append("\n");
        }

        // Output all results
        System.out.print(sb);
    }
}

