import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your grade: ");
        double grade = input.nextDouble();

        String finalgrade; 
        if (grade >= 80 && grade <= 100) {
            finalgrade = "A";

        } else if (grade >= 75 && grade < 80) {
            finalgrade = "B+";

        } else if (grade >= 70 && grade < 75) {
            finalgrade = "B";

        } else if (grade >= 65 && grade < 70) {
            finalgrade = "C+";

        } else if (grade >= 60 && grade < 65) {
            finalgrade = "C";

        } else if (grade >= 55 && grade < 60) {
            finalgrade = "D+";

        } else if (grade >= 50 && grade < 55) {
            finalgrade = "D";

        } else if (grade >= 0 && grade < 50) {
            finalgrade = "F";

        } else {
            System.out.print("User input incorrect");
            input.close();
            return;
        }

        System.out.print("Your grade is "+ finalgrade);
        input.close();
    }
    
}
