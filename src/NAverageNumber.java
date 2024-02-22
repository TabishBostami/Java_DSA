import java.util.Scanner;

public class NAverageNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = (n*(n+1))/2;

        int average = sum/n;


        System.out.println("Sum of n numbers "+sum);
        System.out.println("n = "+n);
        System.out.println("Average of N numbers "+average);

    }
}
