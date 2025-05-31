package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println(max);
    }

    public static int findMax(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;

        int maxLeft = findMax(arr, left, mid);
        int maxRight = findMax(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }
}