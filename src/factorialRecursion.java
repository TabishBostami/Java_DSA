public class factorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        long fact = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
    static long calculateFactorial(int n){
        if(n==0 || n==1)
            return 1;
        return n * calculateFactorial(n-1);
    }
}
