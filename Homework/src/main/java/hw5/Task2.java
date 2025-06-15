package hw5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of());
        list.add(List.of(1));
        list.add(List.of(1));
        list.add(List.of(1,2));
        list.add(List.of(1,3));
        list.add(List.of(1,3));

        System.out.println(whoWinner(5, list));
    }

    public static String whoWinner(int n, List<List<Integer>> m) {
        boolean[] b = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            for (int t : m.get(i)) {
                if (i-t >= 0 && !b[i-t]) {
                    b[i] = true;
                    break;
                }
            }
        }

        return b[n] ? "first" : "second";
    }
}
