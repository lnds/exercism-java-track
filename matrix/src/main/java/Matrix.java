import java.util.*;
import java.util.stream.*;

class Matrix {

    private int[][] rows;
    Matrix(String matrixAsString) {
        var rows = matrixAsString.split("[\\n]+");
        this.rows = Arrays.stream(rows)
            .map(s -> Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray())
            .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int col = columnNumber - 1;
        return IntStream.range(0, rows.length).map(row -> rows[row][col]).toArray();
    }
}
