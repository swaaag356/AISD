package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> partitions = new ArrayList<>();
        generatePartitions(N, new ArrayList<>(), partitions);

        // Вывод в обратном лексикографическом порядке
        for (int i = partitions.size() - 1; i >= 0; i--) {
            List<Integer> partition = partitions.get(i);
            for (int j = 0; j < partition.size(); j++) {
                System.out.print(partition.get(j));
                if (j < partition.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void generatePartitions(int remaining, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        int last = current.isEmpty() ? remaining : current.get(current.size() - 1);
        for (int i = Math.min(remaining, last - 1); i >= 1; i--) {
            // Проверяем, чтобы слагаемые были различными
            if (!current.contains(i)) {
                current.add(i);
                generatePartitions(remaining - i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
