import java.util.Scanner;

public class AreaOfTriangle {
   public void triangleArea(){
       double length = 0;
       double breath = 0;
       double area  = 0;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the length: ");
       length = scanner.nextDouble();

       System.out.print("Enter the breath: ");
       breath = scanner.nextDouble();

       area = length * breath;

       System.out.println("The area is: " + area + "cm");


       scanner.close();
   }
}
