package Turtle;

import java.util.Arrays;

public class Turtle {
    public static void main(String[] args) {
        int[][] square = new int[10][10];
        square[0] = new int[]{123, 567, 3234, 234, 234, 234, 234, 123, 123, 123};
        square[1] = new int[]{45, 67, 23, 78, 23, 90, 23, 78, 65, 12};
        square[2] = new int[]{634, 164, 312, 186, 758, 898, 950, 742, 374, 657};
        square[3] = new int[]{1, 5, 6, 2, 6, 5, 1, 5, 1, 69546};
        square[4] = new int[]{93249, 143, 195, 71, 410, 761, 181, 3412, 523, 62234};
        square[5] = new int[]{3525, 1529, 7741, 7857, 6854, 3858, 6852, 5856, 2510, 412};
        square[6] = new int[]{107250, 75357, 2737, 2736, 7351, 34533, 1375300, 75211, 3, 71};
        square[7] = new int[]{11457, 73459, 43459, 553446, 374333, 6359, 83450, 353451, 252345, 3369};
        square[8] = new int[]{24572, 73671, 23670, 25673, 135671, 1367762, 345696, 15686786, 623454, 34432345};
        square[9] = new int[]{365744, 234534535, 83453457, 87686574, 335609970, 48000, 700007, 130, 45678900, 7808633};


        int[][] newSquare = new int[10][10];
        newSquare[0][0] = square[0][0];
        for (int i = 1; i < square.length; i++) {
            newSquare[0][i] = newSquare[0][i - 1] + square[0][i];
        }
        for (int i = 1; i < square[0].length; i++) {
            newSquare[i][0] = newSquare[i - 1][0] + square[i][0];
        }

        for (int i = 1; i < square.length; i++) {
            for (int j = 1; j < square.length; j++) {
                newSquare[i][j] = square[i][j] + Math.min(newSquare[i - 1][j], newSquare[i][j - 1]);
            }
        }

        System.out.println("Ответ: " + newSquare[square.length - 1][square[0].length - 1]);

        for (int i = 0; i < square.length; i++) {
            System.out.println(Arrays.toString(newSquare[i]));
        }
    }
}
