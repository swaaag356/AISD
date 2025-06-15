import java.util.*;

import java.io.*;

public class AISDTask3 {
    static StringBuilder output = new StringBuilder();
    static int[] current = new int[100];

    static void generate(int n, int max, int depth) {
        if (n == 0) {
            for (int i = 0; i < depth; i++) {
                output.append(current[i]).append(" ");
            }
            output.append("\n");
            return;
        }

        for (int i = Math.min(n, max); i >= 1; i--) {
            current[depth] = i;
            generate(n - i, i, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        // Быстрый ввод
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        generate(N, N, 0);

        System.out.print(output);
    }
}
