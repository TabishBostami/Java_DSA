public class checkprime {
    public static void main(String[] args) {
        int a=11;



        for(int i =1;i<=a;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }

            }
            if(count==2){
                System.out.println(i+" has "+count+" factors");
                System.out.println(i+" is prime number");
                System.out.println();
            }
            else {
                System.out.println(i+" has "+count+" factors");
                System.out.println(i+" is not prime number");
                System.out.println();
            }


           }
    }
}
