public class sqrRoot {
    public static void main(String[] args) {
        System.out.println(sqr(243));
    }
    public static int sqr(int a){

        int l = 1;
        int h = a/2;
        int mid = 0;

        int count = 1 ;


        while(l<=h){

            int m =(l+ h)/2;

            if((m*m)==a){
                l= m+1;
                return m;
            } else if ((m*m)<a) {
                l= m+1;

            }
            else {
                h = m-1;
            }
            mid = m;


        }
        return h;// floor value of square root
    }
}
