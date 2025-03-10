import java.util.Scanner;

public class CalculateCompoundInterest {
    public  void compoundInterest(){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int numberOfTimesCompounded;
        int years;
        double totalAmount;

        System.out.print("Enter the principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times the interest is compounded per year: ");
        numberOfTimesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        totalAmount = principal * Math.pow(1 + rate / numberOfTimesCompounded, numberOfTimesCompounded * years);

        System.out.printf("The amount after %d years is £%.2f ", years, totalAmount);



        scanner.close();
    }
}
