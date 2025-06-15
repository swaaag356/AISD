import java.io.PrintWriter;
import java.util.*;

public class Task1 {
    static int N;
    static Deque<Integer>[] stacks;
    static PrintWriter out;
    static final int MAX_MOVES = 1000000;
    static int moveCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        N = sc.nextInt();
        stacks = new ArrayDeque[N];
        for (int i = 0; i < N; i++) {
            stacks[i] = new ArrayDeque<>();
            int k = sc.nextInt();
            int[] temp = new int[k];
            for (int j = 0; j < k; j++) {
                temp[j] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                stacks[i].addLast(temp[j]);
            }
        }

        if (isCorrect()) {
            out.flush();
            return;
        }

        if (!solve()) {
            out.println(0);
        }
        out.flush();
    }

    static boolean isCorrect() {
        for (int i = 0; i < N; i++) {
            for (int c : stacks[i]) {
                if (c != i + 1) return false;
            }
        }
        return true;
    }

    static boolean solve() {
        for (int target = 1; target <= N; target++) {
            // Очистка целевой стопки от чужих контейнеров
            while (true) {
                if (stacks[target - 1].isEmpty()) break;
                int top = stacks[target - 1].peekLast();
                if (top == target) break;
                int dest = findBufferStack(target - 1, top);
                if (dest == -1) return false;
                moveContainer(target - 1, dest);
            }

            // Перекладываем нужные контейнеры из других стопок
            for (int s = 0; s < N; s++) {
                if (s == target - 1) continue;
                while (!stacks[s].isEmpty() && stacks[s].peekLast() == target) {
                    moveContainer(s, target - 1);
                }
            }
        }
        return isCorrect();
    }

    static int findBufferStack(int avoidStack, int containerType) {
        for (int i = 0; i < N; i++) {
            if (i == avoidStack) continue;
            if (i == containerType - 1) continue;
            return i;
        }
        return -1;
    }

    static void moveContainer(int from, int to) {
        int c = stacks[from].removeLast();
        stacks[to].addLast(c);
        out.println((from + 1) + " " + (to + 1));
        moveCount++;
        if (moveCount > MAX_MOVES) {
            out.flush();
            System.exit(0);
        }
    }
}