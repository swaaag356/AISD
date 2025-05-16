package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashTask2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4};
        int k = 3;
        System.out.println(check(nums,k));
    }

    public static boolean check(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                return true ;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
