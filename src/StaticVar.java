public class StaticVar {
    static  int a;

    public static void main(String[] args) {
        int a= 10;
        System.out.println("From main()"+a);
        System.out.println(StaticVar.a);
        m1();
    }

    public static void m1() {
        System.out.println("From m1()"+a);

    }
}
