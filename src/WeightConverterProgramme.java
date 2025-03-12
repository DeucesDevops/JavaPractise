import java.util.Scanner;

public class WeightConverterProgramme {
    public void weightConverter() {

        Scanner scanner = new Scanner(System.in);

        //Declare variables
        double weight;
        double newWeight;
        int choice;

        //Welcome message to Users
        System.out.println("Welcome to the weight converter programme (kg/lb)");
        System.out.println("1: Convert kg to lb");
        System.out.println("2: Convert lb to kg");

        //prompt user to enter weight either in kg or lb
        System.out.print("Choose a weight option (1 or 2): ");
        choice = scanner.nextInt();

        //Option to convert kg to lb
        if (choice == 1) {
            System.out.print("Enter the weight in kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight is: %.2f lb\n", newWeight);
        }
        //Option to convert lb to kg
        else if (choice ==2) {
            System.out.println("Enter the weight in lb: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("The new weight is: %.2f kg\n", newWeight);
        }
        else {
            System.out.println("Not a valid option");
        }

        scanner.close();
    }
}
