
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the Array: ");
        int a = sc.nextInt();

        int[] arr= new int[a];

        for(int i=0;i<a;i++){
            System.out.print("Enter Value of index "+ i + " : ");
            int an = sc.nextInt();
            arr[i] = an;

        }
        for(int j : arr){
            System.out.print(j +" ");
        }


    }
}
