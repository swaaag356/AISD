package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        int l = 0;
        int r = arr.length - 1;

    }

    public static int binaryFind(int[] arr,int l, int r, int a) {
        while (l <= r) {
            int mid = (r + l) / 2;

            if (arr[mid] == a && arr[mid + 1] == a) {
                binaryFind(arr,mid + 1, r, a);
            } else if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] > a) {
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}