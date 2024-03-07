import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        Scanner sc = new Scanner(System.in);

        for(int i =0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i =0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
