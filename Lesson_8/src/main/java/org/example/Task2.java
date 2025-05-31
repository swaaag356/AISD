package org.example;

public class Task2 {
    public static void main(String[] args) {
        int num = 20;
        int zeros = countZeros(num);
        System.out.println(zeros);
    }

    public static int countZeros(int num) {
        if ((num & 1) == 1) {
            return 0;
        }
        return 1 + countZeros(num >> 1);
    }
}
