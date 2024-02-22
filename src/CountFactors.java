import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter Number to check Factors");
        int a = in.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;

            }
            else{
                continue;
            }

        }
        if (count==2){
            System.out.println(a +" is a prime number");
        }
        else{
            System.out.println(a +"is not a prime number");
        }


    }
}
