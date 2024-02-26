import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int number = in.nextInt();
        int a = ReverseMethod.reverse(number);

        if(number == a){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("it is not a palindrome");
        }

    }
}
