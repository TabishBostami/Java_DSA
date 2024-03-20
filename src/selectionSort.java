import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for(int i = 0; i< arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] =temp ;
        }
        System.out.print(Arrays.toString(arr));
    }
}
