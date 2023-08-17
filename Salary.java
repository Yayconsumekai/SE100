import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your hours worked: ");
        Double hour = input.nextDouble();

        input.close();

        Double salary;
        if (hour > 0 && hour <= 40) {
            salary = hour * 8;
        } else if (hour > 40) {
            salary = ((hour - 40) * 12) + 320;
        } else {
            System.out.print("Invalid input");
            return;
        }

        System.out.print("Your salary is $" + salary);
    }
    
}
