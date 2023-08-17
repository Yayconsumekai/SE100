import java.util.Scanner;

public class rectangle {
public static void main(String[] args) {
    double result;
    Scanner input = new Scanner(System.in);
    System.out.println("choose operator");
    int operator = input.nextInt();
    System.out.println("1=addition 2=subtraction 3=multiplication 4=division");
    double firstNum = input.nextDouble();
    System.out.println("input first number");
    double secNum = input.nextDouble();
    System.out.println("input second number");

    switch(operator){
        case 1:
        result = firstNum + secNum;
        break;
        
        case 2:
        result = firstNum - secNum;
        break;

        case 3:
        result = firstNum * secNum;
        break;

        case 4:
        result = firstNum / secNum;
        break;

        default:
        System.out.println("you're choice is invalid");
        input.close();
        return;
    }
    input.close();
    System.out.println("your result is "+ result);
}   
    
}
