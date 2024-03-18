public class checkprime {
    public static void main(String[] args) {


        int arr[] = {1,7,6,9,11,8,4,2,10};
        int count=0;
        for(int a: arr){
            for(int j=1;j<=a;j++){
                if(a%j==0){
                    count++;
                }

            }
            if(count==2){
                System.out.println(a+" has "+count+" factors");
                System.out.println(a+" is prime number");
                System.out.println();
            }
            else {
                System.out.println(a+" has "+count+" factors");
                System.out.println(a+" is not prime number");
                System.out.println();
            }


           }
    }
}
