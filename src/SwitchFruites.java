import java.util.Scanner;

public class SwitchFruites {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("Mango is king of friut");
                break;
            case "grape":
                System.out.println("grapes are sour");
                break;
            case "apple":
                System.out.println("apple is good for health");
                break;
            default:
                System.out.println("Give input  mango ,grape or apple");
                break;
        }
    }
}
