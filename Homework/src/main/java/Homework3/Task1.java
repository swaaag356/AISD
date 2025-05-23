package Homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {123, 122, 111, 110, 124, 1234, 12345, 23561};
        System.out.println(findElem(array));
    }

    public static int findElem(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] > array[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
