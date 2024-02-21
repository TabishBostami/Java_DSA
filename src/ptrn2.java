public class ptrn2 {
    public static void main(String[] args) {

        int a=1;
        char ch='A';

        for (int i = 1; i <=5; i++) {
            for (int j =1; j <=5; j++) {
                if(i<=j)
                {
                    if(i%2==1)
                    {
                        System.out.print((ch++) +" " );
                    }

                    else
                    {
                        System.out.print((a++) +" ");
                    }
                }

                else
                {
                    System.out.print("  ");
                }



            }
            System.out.println();
        }
    }
}
