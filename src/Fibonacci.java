import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int p =0;
        int i =1;
        int count = 2;

        while(count <=n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.println(i);

    }
}
