import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nfact =1;
        for(int i=n;i!=1;i--)
        {

            nfact = nfact * i ;

        }

        System.out.println(nfact);
    }
}
