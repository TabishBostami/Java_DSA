import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Ta check weather it is palindrome or not: ");
        int num = sc.nextInt();
        checkPlaindrome(num);
    }

    static void checkPlaindrome(int num){
        String number = Integer.toString(num);
        int s=0;
        int e=number.length()-1;
        while(s<e){
            if(number.charAt(s)== number.charAt(e)){
                s++;
                e--;
            }
            else {
                System.out.println("This is not a palindrome");
                return;
            }

        }
        System.out.println(number + " It is a palindrome");
    }
}
