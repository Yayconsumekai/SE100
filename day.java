import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input time in second: ");
        int second = input.nextInt();

        input.close();

        int day = (second / 86400);
        int hour = (second / 3600);
        int minute = (second / 60);

        System.out.println("Days: " + day);
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: "+ minute);
        System.out.println("Seconds: "+ second);

    }
    
}
