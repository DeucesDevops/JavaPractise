import java.util.Scanner;

public class TemperatureConvertionProgramme {
    public void temperatureConverter() {
        //declare variables
        double temp;
        double newTemp;
        String unit;

        //welcome message to user
        System.out.println("Welcome to the temperature converter programme (C/F)");
        System.out.println("C: Convert C to F");
        System.out.println("F: Convert F to C");

        //prompt user to enter temperature either in C or F
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature (C/F): ");
        unit = scanner.next().toUpperCase();

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        //using teary operator
        newTemp = (unit.equals("C")) ? (temp * 9/5) + 32 : (temp - 32) * 5/9;
        System.out.printf("the new temperature is: %.2f%s", newTemp, unit);


        scanner.close();

    }
}
