import java.util.Scanner;

public class ReverseN
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();//637
        int ans = 0;

        while (n>0){
            int rem =n%10;
            n/=10;
            ans = ans*10+rem;

        }
        System.out.println(ans);

    }
}
