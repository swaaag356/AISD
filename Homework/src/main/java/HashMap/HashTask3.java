package HashMap;

import java.util.*;

public class HashTask3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 5};
        int[] arr2 = {2, 2, 4, 5};
        System.out.println(Arrays.toString(task(arr1,arr2)));
    }

    public static int[] task(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            map1.put(a, map1.get(a) == null ? 1 : map1.get(a) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            int a = arr2[i];
            map2.put(a, map2.get(a) == null ? 1 : map2.get(a) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int value1 = map1.get(entry.getKey());
                int value2 = map2.get(entry.getKey());

                for (int i = 0; i < (Math.min(value1, value2)); i++) {
                    res.add(entry.getKey());
                }
            }
        }
        int[] result = res.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
