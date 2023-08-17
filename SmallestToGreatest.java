import java.util.Scanner;

public class SmallestToGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        // Read three inputs
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Using variable 'temp' to swap values if necessary
        int temp;

        // Compare and swap num1 and num2
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Compare and swap num2 and num3
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Compare and swap num1 and num2 again, in case they need to be rearranged
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        input.close();

        System.out.println("Smallest to greatest: " + num1 + " " + num2 + " " + num3);
    }
}

