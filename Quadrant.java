import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angle: ");
        Double angle = input.nextDouble();
        input.close();

        angle = otherangle(angle);
        int quadrant;
        if (angle > 0 && angle < 90) {
            quadrant = 1;
        } else if (angle > 90 && angle < 180) {
            quadrant = 2;
        } else if (angle > 180 && angle < 270) {
            quadrant = 3;
        } else if (angle > 270 && angle < 360) {
            quadrant = 4;
        } else {
            System.out.print("This line lies on the axis.");
            return;
        }
        
        System.out.print("This line is in the quadrant " + quadrant);

    }

    private static double otherangle(double angle) {
        if (angle < 0) {
            angle += 360;
        } else if (angle > 360) {
            angle %= 360;
        }
        return angle;
    }
}
