import java.util.Scanner;

public class Sortnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = input.nextDouble();

        System.out.print("Input second number: ");
        double num2 = input.nextDouble();

        System.out.print("Input third number: ");
        double num3 = input.nextDouble();

        if (num1>num2){
        double temp = num1;
        num1 = num2;
        num2 = temp;
        }

        if (num2>num3){
        double temp = num2;
        num2 = num3;
        num3 = temp;
        }

        if (num1>num2){
        double temp = num1;
        num1 = num2;
        num2 = temp;
        }

        if (num1>num3){
        double temp = num1;
        num1 = num3;
        num3 = temp;
        }

        else{
            System.out.println(num1+ " Is Smaller than " +num2+ " Is Smaller than " +num3);
        }

        input.close();
    }    
}
