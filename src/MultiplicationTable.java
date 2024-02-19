import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=1; i<=10;i++){
            int val = a*i;
            System.out.println(a + "X" + i + "=" + val );
        }

    }
}
