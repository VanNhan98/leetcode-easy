import java.util.Arrays;

public class b566ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c))); // Output: [[1, 2, 3, 4]]
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int a = mat.length;
        int b = mat[0].length;
        if(a * b != r * c ) {
            return mat;
        }

        int[][] reshape = new int[r][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b ; j++) {
                int tmp = i * b + j;
                reshape[tmp / c][tmp % c] = mat[i][j];
            }
        }
        return reshape;

    }
}
