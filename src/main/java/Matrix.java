import java.util.ArrayList;

public class Matrix {
    public static int sumOfEvenNumbers(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sum += anInt;
                }
            }
        }
        return sum;
    }
    public static ArrayList<Integer> rowsWithZero(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean has = false;
            for (int anInt : matrix[i]) {
                if (anInt == 0) {
                    has = true;
                    break;
                }
            }
            if (has) {
                list.add(i);
            }
        }
        return list;
    }
}
