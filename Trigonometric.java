import java.util.Scanner;

public class Trigonometric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angle: ");
        double angle = input.nextDouble();
        angle = Math.toRadians(angle);

        System.out.println("Select operation: 1.sin, 2.cos, 3.tan, 4.hyperbolic sin, 5.hyperbolic cos and 6.hyperbolic tan");
        System.out.print("Your choice: ");
        int menu = input.nextInt();

        input.close();

        double result = 0;
        switch (menu) {
            case 1:
                result = Math.sin(angle);
                break;
            case 2:
                result = Math.cos(angle);
                break;
            case 3:
                result = Math.tan(angle);
                break;
            case 4:
                result = Math.sinh(angle);
                break;
            case 5:
                result = Math.cosh(angle);
                break;
            case 6:
                result = Math.tanh(angle);
                break;
            default:
                System.out.print("Invalid operation choice.");
                return;
        }

        System.out.print("Result is " + result);

    }
}
