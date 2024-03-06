public class Test {
    static int a ;
    int b;
    static{
        System.out.println(a);
        a=12;
    }
    static int c=20;
    {
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(a);
        System.out.println(t1.b);
        System.out.println(c);
    }
}
