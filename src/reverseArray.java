import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        revArray(arr);
    }
    static void revArray(int[] arr){

        int e =arr.length-1;
        for(int s =0;s<e;s++,e--){
           arrSwap.swap(arr,s,e);
//
        }
        System.out.println(Arrays.toString(arr));
    }
}
