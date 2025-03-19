import java.util.Scanner;

public class BankingProgramme {
    Scanner scanner = new Scanner(System.in);

    //declare variables
    double balance = 0;
    double amount;
    int choice;
    boolean appRunning = true;

    public  void bankingProgramme() {

        //display welcome message and description of programme
        System.out.println("********************************");
        System.out.println("Welcome to the Banking Programme");
        System.out.println("********************************");
        System.out.println(" ");

        while(appRunning) {
            //display menu options
            System.out.println(" ");
            System.out.println("Menu Options");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println(" ");
            System.out.print("Select a number option above: ");

            //get and process user choice
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> {
                    System.out.println("Thank you for using the Banking Programme 👌");
                    appRunning = false;
                }
                default -> {
                    System.out.println("Invalid Option");
                    System.out.println(" ");

                }
            }
        }


        scanner.close();

    }

    //show balance
     void showBalance() {
        System.out.println("Your balance is: " + balance);
    }

    //deposit money
     void depositMoney() {
        System.out.println("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        balance += amount;
        System.out.printf("Your balance is: £%.2f", balance);
    }

    //withdraw money
     void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        balance -= amount;
        System.out.printf("You have withdrawn: £%.2f", amount);
        System.out.printf("Your balance is: £%.2f", balance);
    }


}
