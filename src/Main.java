//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String a = "Tabish bostami";
        System.out.println(a+" a "+System.identityHashCode(a));

        String b= a;
        System.out.println(b+" b " +System.identityHashCode(b));
        b="Tabish";
        System.out.println(a+" a "+System.identityHashCode(a));
        System.out.println(b+" b "+System.identityHashCode(b));


        }
    }
