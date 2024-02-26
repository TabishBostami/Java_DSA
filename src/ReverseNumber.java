import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner in  =new Scanner(System.in);
        System.out.println("Enter your Number");
        int a = in.nextInt();
        int temp= 0;
        int revserse=0;
        while(a>0){
            temp = a%10;
            a =a/10;
            revserse = revserse*10 +temp;
        }
        System.out.println(revserse);

    }
}
