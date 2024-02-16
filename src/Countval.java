public class Countval
{
    public static void main(String[] args)
    {
        int n = 1385757879;
        int c = 7;
        int count = 0;
        while(n>0)
        {
           int r = n%10;
           if (c == r)
           {
               count++;
           }
           n=n/10;

        }
        System.out.println(count);
    }
}
