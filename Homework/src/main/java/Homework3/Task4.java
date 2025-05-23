package Homework3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = {15, 5, 11, 10, 12};
        System.out.println(maxCount(nums,30));
    }

    public static int maxCount(int[] nums,int s) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(sum + nums[i] <= s) {
                count++;
                sum+=nums[i];
            }
        }
        return count;
    }
}
