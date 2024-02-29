class NonStatic
{
    int a ;
    {
        System.out.println("From MLNSI-1");
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("from main()");
        NonStatic t1 = new NonStatic();
        System.out.println(t1.a);
        NonStatic t2 = new NonStatic();
        System.out.println("end of main()");
    }

    {
        System.out.println("from MLNSI-2");
    }
}
