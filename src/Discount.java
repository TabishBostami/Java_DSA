import java.util.Scanner;

public class Discount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total price");
        int price = in.nextInt();

        System.out.println("Enter Discount Percentage");
        float dis = in.nextInt();

       float price_discount = price * ((dis)/100);
       float price_after_discount = price-price_discount;
       System.out.println(price_discount);
       System.out.println(price_after_discount);


    }
}
