package matrix;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        short[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showMatrix(m);
        shiftLeft(m, 5);
        System.out.println();
        showMatrix(m);
    }

    public static void shiftLeft(short[][] m, int steps) {
        for (int i = 0; i < m.length; i++) {
            int realSteps = steps % m[i].length;
            while (realSteps-- > 0) {
                short temp = m[i][0];
                for (int j = m[i].length - 1; j >= 0; j--) {
                    short val = m[i][j];
                    m[i][j] = temp;
                    temp = val;
                }
            }
        }
    }

    public static void showMatrix(short[][] m) {
        Arrays.stream(m).forEachOrdered(s -> {
            for (short k : s) {
                System.out.print(k + " ");
            }
            System.out.println();
        });
    }
}
