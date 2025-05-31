package org.example;

public class Task3 {

    public static int karatsuba(int x, int y) {
        if (x < 2 || y < 2) {
            return x * y;
        }

        // Найдём наибольшее количество битов
        int n = Math.max(Integer.highestOneBit(x), Integer.highestOneBit(y));
        int half = Integer.toBinaryString(n).length() / 2;

        // Разделим x на a и b, y на c и d
        int highMask = ~((1 << half) - 1); // маска для верхней части
        int lowMask = (1 << half) - 1;     // маска для нижней части

        int a = (x & highMask) >>> half;
        int b = x & lowMask;
        int c = (y & highMask) >>> half;
        int d = y & lowMask;

        // Рекурсивные вызовы
        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int abcd = karatsuba(a + b, c + d);

        // Результат: ac * 2^(2*half) + (abcd - ac - bd) * 2^half + bd
        int result = (ac << (2 * half)) + ((abcd - ac - bd) << half) + bd;
        return result;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt("110101", 2);
        int y = Integer.parseInt("1011011", 2);

        int result = karatsuba(x, y);

        System.out.println("Binary:");
        System.out.println(Integer.toBinaryString(x) + " * " + Integer.toBinaryString(y)
                + " = " + Integer.toBinaryString(result));
        System.out.println(x + " * " + y + " = " + result);
    }
}