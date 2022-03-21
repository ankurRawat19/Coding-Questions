package ArraysQues.easy;

public class MatrixDiagnolSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] mat) {
        int count = 0;
        int k = 0;
        for (int j = mat.length - 1; j >= 0; j--) {
            count += mat[k][j];
            count += mat[k][k];
            k++;
        }
        if (mat.length % 2 != 0)
            count -= mat[mat.length / 2][mat.length / 2];
        return count;
    }
}
