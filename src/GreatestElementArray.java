import java.util.Arrays;

public class GreatestElementArray {
    public static void main(String[] args) {
        int[] arr={7,57,54,33,2,4,7,6,88,45,76,4,5,7};

        int greatest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(greatest<arr[i]){
                greatest = arr[i];
            }
        }
        System.out.println("Greatest number in array is: "+greatest);
    }
}
