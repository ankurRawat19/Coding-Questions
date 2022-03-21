package ArraysQues.easy;

public class ManhattanDist {
    public static void main(String[] args) {
        int[][] arr = {{1,2},
                       {3,1},
                       {2,4},
                       {2,3},
                       {4,4}};
        int x = 3, y = 4;
        System.out.println(nearestValidPoint1(x,y,arr));
    }

    public static int nearestValidPoint1(int x, int y, int[][] points){
        if(points.length == 1){
            if(points[0][0] == x && points[0][1] == y){
                return points[0][0];
            }
        }
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int rows = 0 ; rows < points.length; rows++){
            int[] temp = points[rows];
                if(temp[0] == x || temp[1] == y){
                    if (ans > Math.abs(x - temp[0] + Math.abs(y-temp[1]))){
                        ans = Math.abs(x - temp[0] + Math.abs(y-temp[1]));
                        index = rows;
                    }
            }
        }
        return index;
    }

//    public int nearestValidPoint(int x, int y, int[][] points) {
//        int min = Integer.MAX_VALUE;
//        int index = -1;
//        for(int i = 0; i < points.length; i++){
//            int[] temp = points[i];
//            if(temp[0] == x || temp[1] == y){
//                if(min > (Math.abs(x-temp[0]) + Math.abs(y-temp[1]))){
//                    min = Math.abs(x-temp[0]) + Math.abs(y-temp[1]);
//                    index = i;
//                }
//            }
//        }
//        return index;
//    }
}
