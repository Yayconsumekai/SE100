import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input your income: ");
        double income = input.nextDouble();

        input.close();

        double result;
        if(income >= 0 && income <= 50000) {
            result = income * 0.05; 
        } else if (income > 50000 && income <= 100000) {
            result = (income - 50000) * 0.06 + (50000 * 0.05);
        } else if (income > 100000 && income <= 200000) {
            result = (income - 100000) * 0.07 + (50000 * 0.05) + (50000 * 0.06);
        } else if (income > 200000 && income <= 300000) {
            result = (income - 200000) * 0.08 + (50000 * 0.05) + (50000 * 0.06) + (100000 * 0.07);
        } else {
            result = (income - 300000) * 0.1 + (50000 * 0.05) + (50000 * 0.06) + (100000 * 0.07) + (100000 * 0.08);
        }

        System.out.print("Result is "+ result );
        
        
    }
}
