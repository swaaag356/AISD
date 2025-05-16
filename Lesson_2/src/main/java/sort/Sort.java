package sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {123123, 5, 15, 2135, 2, 463, 463, 4, 345, 234, 2, 5, 25234, 25, 3468, 7346, 734, 235, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
