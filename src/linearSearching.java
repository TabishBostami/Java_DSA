import java.util.Arrays;

public class linearSearching {
    public static void main(String[] args) {
        int [][] arr = {
                {23,12,12},
                {1,4,6},
                {12,35,32}
        };
        int target = 32;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col <arr[row].length;col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
