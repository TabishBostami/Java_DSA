import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,12,15,71,52,4,23,21,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
