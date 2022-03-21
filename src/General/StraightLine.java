package General;

public class StraightLine {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        boolean valid = false;
        for(int rows = 0 ;rows < coordinates.length-1; rows++){
            for(int cols = 0 ; cols < coordinates[rows].length-1; cols++) {
                if (coordinates[rows + 1][cols + 1] != coordinates[rows][cols] + 1) {
                    valid = false;
                } else
                    valid = true;
            }
        }
        return valid;
    }
}
