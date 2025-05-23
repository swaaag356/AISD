package Homework3;

public class Task2 {
    public static void main(String[] args) {
        String str = "the   sky   is   blue ";
        printReverse(str);
    }

    public static void printReverse(String s) {
        int end = s.length() - 1;

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            System.out.print(s.substring(start + 1, end + 1));
            if (start > 0) {
                System.out.print(" ");
            }
            end = start - 1;
        }
    }
}
