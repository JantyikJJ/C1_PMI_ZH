import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    @Test
    public void testSumOfEvenNumbers() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        assertEquals(-220, Matrix.sumOfEvenNumbers(matrix));
    }

    @Test
    public void testRowsWithZero() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   0, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,   0,  95, -84, -53}
        };

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);

        ArrayList<Integer> actual = Matrix.rowsWithZero(matrix);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}