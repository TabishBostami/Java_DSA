public class compoundInterest {
    public static void main(String[] args) {
        double principal = 1000; // Initial amount
        double annualRate = 5; // Annual interest rate in percentage
        int years = 3; // Number of years
        int compoundFrequency = 12; // Number of times interest is compounded per year

        double rate = annualRate / 100;
        double base = 1 + (rate / compoundFrequency);
        double exponent = compoundFrequency * years;
        double amount = principal * Math.pow(base, exponent);

        System.out.println("Compound interest after " + years + " years: " + amount);
    }
}
