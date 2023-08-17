import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First input: ");
        double x = input.nextDouble();

        System.out.print("Second input: ");
        double y = input.nextDouble();

        System.out.println("Select operator: 1.Addition, 2.Subtraction, 3.Multiplication and 4.Division");
        int menu = input.nextInt();

        input.close();

        double result = 0;
        switch (menu) {
            case 1:
                result = x+y;
                break;
            case 2:
                result = x-y;
                break;
            case 3:
                result = x*y;
                break;
            case 4:
                result = x/y;
                break;
            default:
                System.out.print("Invalid operation choice");
                return;
        }

        System.out.print("Result is " + result);

    }
}
