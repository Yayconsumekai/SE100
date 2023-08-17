import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num = input.nextDouble();

        System.out.print("Select your operation: c.Fahrenheit to Celsius f.Celsius to Fahrenheit: ");
        char choice = input.next().charAt(0);

        double result = 0;

        if (choice == 'c' || choice == 'C') {
            result = (num - 32) * 5.0 / 9.0;
            System.out.print( num + " Fahrenheit is " + result + " Celsius");
        } else if (choice == 'f' || choice == 'F') {
            result = ((9 * num) /5.0) + 32;
                System.out.print( num + " Celsius is " + result + " Fahrenheit");
        } else {
            System.out.print("Invalid choice.");
            input.close();
            return;
        }

        input.close();
        
    }
    
}
