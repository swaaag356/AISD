package org.example;

public class Task3 {

    public static int karatsuba(int x, int y) {
        if (x < 2 || y < 2) {
            return x * y;
        }

        int n = Math.max(Integer.highestOneBit(x), Integer.highestOneBit(y));
        int half = Integer.toBinaryString(n).length() / 2;

        int highMask = ~((1 << half) - 1);
        int lowMask = (1 << half) - 1;

        int a = (x & highMask) >>> half;
        int b = x & lowMask;
        int c = (y & highMask) >>> half;
        int d = y & lowMask;

        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int abcd = karatsuba(a + b, c + d);

        int result = (ac << (2 * half)) + ((abcd - ac - bd) << half) + bd;
        return result;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt("110101", 2);
        int y = Integer.parseInt("1011011", 2);

        int result = karatsuba(x, y);

        System.out.println(x + " * " + y + " = " + result);
    }
}