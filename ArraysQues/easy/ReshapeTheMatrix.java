package ArraysQues.easy;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{4,5}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.toString(matrixReshape(mat,r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        int[][] output = new int[r][c];
        int[] temp = new int[mat.length*mat[0].length];

        int index = 0;
        for(int[] i :mat){
            for(int j : i){
                temp[index] = j;
                index++;
            }
        }
        index = 0;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c; j++){
                output[i][j] = temp[index];
            }
        }

        return output;
    }
}
