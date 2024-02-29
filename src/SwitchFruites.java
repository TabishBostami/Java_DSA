import java.util.Scanner;

public class SwitchFruites {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("Mango is king of friut");
            case "grape" -> System.out.println("grapes are sour");
            case "apple" -> System.out.println("apple is good for health");
            default -> System.out.println("Give input  mango ,grape or apple");
        }
    }
}
