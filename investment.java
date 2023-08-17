import java.util.Scanner;

public class investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input investment amount: ");
        double investamount = input.nextDouble();

        System.out.print("Input annual interest rate: ");
        double interestrate = input.nextDouble() / 100;

        System.out.print("Input number of year: ");
        int year = input.nextInt();

        double power = Math.pow((1 + interestrate), year);

        double futureamount = (investamount * power);
        System.out.print("The future investment value is: " + futureamount);
        
        input.close();

    }
    
}
