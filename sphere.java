import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input radius: ");
        double radius = input.nextDouble();

        double pi = 3.1416;
        double surface = 4 * pi * Math.pow(radius, 2);
        double volume = ((4 / 3) * pi * Math.pow(radius, 3));

        System.out.print("Surface is " + surface + " And volume is " + volume);

        input.close();
    }
    
}
