import java.util.Scanner;

public class tax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input money amount: ");
        double amount = input.nextDouble();

        input.close();

        double sum = 0;
        if (amount >= 0 && amount <= 50000) {
            sum = ( amount * 0.05 );
        } else if (amount > 50000 && amount <= 100000) {
            sum = ( 50000 * 0.05 ) + (( amount - 50000 ) * 0.06);
        } else if (amount > 100000 && amount <= 200000) {
            sum = ( 50000 * 0.05 ) + ( 50000  * 0.06) + (( amount - 100000 ) * 0.07);
        } else if (amount > 200000 && amount <= 300000) {
            sum = ( 50000 * 0.05 ) + ( 50000  * 0.06) + ( 100000 * 0.07 ) +((amount - 200000) * 0.08);
        } else if (amount > 300000) {
            sum = ( 50000 * 0.05 ) + ( 50000  * 0.06) + ( 100000 * 0.07 ) + ( 100000 * 0.08 ) + ((amount - 300000) * 0.1);
        }

        System.out.print("The amount of tax you have to pay is: " + sum);
        
    }
    
}
