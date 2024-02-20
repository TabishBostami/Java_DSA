import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;

//        while(num!=0){
//            int temp = num%10;
//            sum = sum+temp;
//            num/=10;
//        }
        for(int i = num; i!=0; i=i/10){
            int temp = i%10;
            sum+=temp;
        }
        System.out.println("sum of digits: "+sum);
    }
}
