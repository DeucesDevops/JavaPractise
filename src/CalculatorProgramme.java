import java.util.Scanner;

public class CalculatorProgramme {
    public void calculator() {
        double num1;
        double num2;
        double result;
        char operator;

        System.out.println("Welcome to the calculator programme");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter any of these operators (+, -, *, /,^): ");;
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        //using switch statement to perform operations
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Cannot divide by 0");
                    return;
                }
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Not a valid operator");
                return;
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
