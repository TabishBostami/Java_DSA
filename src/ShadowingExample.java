public class ShadowingExample {
    int x = 10; // Outer variable

    public void shadowTest() {
        int x = 20; // Inner variable shadows the outer variable
        System.out.println("Inner x: " + x); // Prints the value of the inner variable
    }

    public static void main(String[] args) {
        ShadowingExample example = new ShadowingExample();
        System.out.println("Outer x: " + example.x); // Prints the value of the outer variable
        example.shadowTest(); // Calls the method where shadowing occurs
    }
}
