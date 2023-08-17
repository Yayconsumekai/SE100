import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input(in double): ");
        double amount = input.nextDouble();

        int remainamount = (int)(amount * 100);

        int dollars = (remainamount/100);
        remainamount = (remainamount%100);

        int quarters = (remainamount/25);
        remainamount = (remainamount % 25);

        int dimes = (remainamount/10);
        remainamount = (remainamount%10);

        int nickels = (remainamount/5);
        remainamount = (remainamount%5);

        int pennies = remainamount;

        System.out.print(amount + " Is equal to " + dollars + "Dollars,"+ quarters + "Quarters,"+ dimes + "Dimes,"+ nickels + "Nickels, and " +remainamount+ "Pennies.");
        
    }
}