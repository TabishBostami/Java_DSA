import java.util.Scanner;

public class Countnum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter Number to check Factors");
        int a = in.nextInt();

        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println("Factors of "+ a +" are " +i);
            }
            else{
                continue;
            }
        }


    }
}
