import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Generating random double value between 0.0 (inclusive) and 1.0 (exclusive)

        // Generating random integer in a specified range
        int min = 10;
        int max = 100;

        // Calculate the random integer within the range
        // int randomInt = (randomValue * (max - min + 1)) + min;

        // if (randomInt >= min && randomInt <= max) {
        //     System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);
        // } else {
        //     System.out.println("Out of bounds");
        // }
        int input2 = input.nextInt();

        switch (input2) {
            case 1:
                int randomValue = (int) (Math.random() * 10);
                System.out.println(randomValue);
                break;
            case 2:
                int randomValue2 = (int) (Math.random() * 100);
                System.out.println(randomValue2);
                break;
            case 3:
                int randomValue3 = (int) (Math.random() * 1000);
                System.out.println(randomValue3);
            default:
                break;
        }
    }

}
