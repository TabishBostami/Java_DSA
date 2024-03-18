import java.util.Scanner;

public class CheckNumInArr {
    public static void main(String[] args) {
        int[] arr = {1,7,6,9,11,8,4,2,10};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to serach: ");

        int a = sc.nextInt();

        for(int b : arr){
            if (a==b){
                System.out.println("Yes this is present");
                return;
            }

        }
            System.out.println("this is not present");

    }
}
