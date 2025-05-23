package Homework3;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        String[] strs = {"3", "30", "34", "5", "9"};
        System.out.println(maxValue(strs));
    }

    public static int maxValue(String[] nums) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(nums, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2);
            }
        });
        Arrays.stream(nums).forEach(sb::append);

        return Integer.parseInt(sb.toString());
    }
}
