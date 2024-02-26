import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        System.out.println(reverse(1234));

    }

    public static int reverse(int num) {
        int sum = 0;
        for (int i = num; i != 0; i /= 10) {
            int rem = i % 10;
            sum = sum * 10 + rem;
        }
        return sum;
    }
}


