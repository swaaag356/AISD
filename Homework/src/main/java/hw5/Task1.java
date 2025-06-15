package hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minThree(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    public static int[] minThree(int[] array, int t) {
        Arrays.sort(array);
        int length = array.length;
        int sum = array[0] + array[1] + array[2];
        int[] result = new int[]{array[0], array[1], array[2]};

        for (int i = 0; i < length - 2; ++i) {
            int l = i + 1;
            int h = length - 1;

            while (l < h) {
                int c = array[i] + array[l] + array[h];

                if (Math.abs(c - t) < Math.abs(sum - t)) {
                    sum = c;
                    result = new int[]{array[i], array[l], array[h]};
                }

                if (c < t) {
                    l++;
                } else if (c > t) {
                    h--;
                } else {
                    return result;
                }
            }
        }
        return result;
    }
}
