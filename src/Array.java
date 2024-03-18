import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [][] arr = {
                {11, 12, 13, 34},
                {15, 26, 74, 38},
                {59, 10, 21, 12}
        };


        System.out.println(arr.length);
        System.out.println(arr[1].length);

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
//        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
