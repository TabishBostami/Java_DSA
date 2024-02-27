public class StaticInitializerExample {
    // Static variable with single line static initializer
    static int singleLineStaticVar = 10;

    // Static variable with multiline static initializer
    static int multiLineStaticVar;

    static {
        // Multiline static initializer
        int result = 0;
        for (int i = 1; i <= 5; i++) {
            result += i;
        }
        multiLineStaticVar = result;
    }

    public static void main(String[] args) {
        System.out.println("Single Line Static Variable: " + singleLineStaticVar);
        System.out.println("Multiline Static Variable: " + multiLineStaticVar);
    }
}
