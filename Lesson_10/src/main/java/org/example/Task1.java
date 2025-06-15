package org.example;

import java.util.*;

public class Task1 {
    public static int[] findClosestTriplet(int[] arr, int t) {
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[3];
        int minDiff = Integer.MAX_VALUE;

        // Перебор всех пар с сохранением их сумм
        Map<Integer, int[]> pairSums = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Проверим, можно ли с ранее сохранёнными парами составить тройку
            for (Map.Entry<Integer, int[]> entry : pairSums.entrySet()) {
                int pairSum = entry.getKey();
                int currentSum = pairSum + arr[i];
                int diff = Math.abs(currentSum - t);
                if (diff < minDiff) {
                    minDiff = diff;
                    result[0] = arr[i];
                    result[1] = entry.getValue()[0];
                    result[2] = entry.getValue()[1];
                }
            }

            // Сохраняем пары с текущим элементом
            for (int j = 0; j < i; j++) {
                int sum = arr[i] + arr[j];
                // Гарантирована уникальность — достаточно одной пары
                pairSums.put(sum, new int[]{arr[i], arr[j]});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 5, 8, 3, 0};
        int t = 10;
        int[] res = findClosestTriplet(arr, t);
        System.out.println("Closest triplet: " + res[0] + ", " + res[1] + ", " + res[2]);
    }
}