public class PtrnPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j =i+1; j <=5; j++)
            {

                System.out.print("  ");

            }

            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

