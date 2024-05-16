import java.util.Scanner;

public class stirngSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        String num = Integer.toString(n);

        for (int i = 0; i < num.length(); i++) {

            int number = Integer.parseInt(String.valueOf(num.charAt(i)));

            sum+= number;

        }
        System.out.println(sum);
    }
}
