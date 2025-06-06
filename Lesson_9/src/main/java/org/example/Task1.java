package org.example;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int count = sc.nextInt() - 2;

        while (count != 0) {
            int temp = n1;
            n1 = n2;
            n2 += temp;
            count--;
        }
        System.out.println(n2 % 10);
    }
}