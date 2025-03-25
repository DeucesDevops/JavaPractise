import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numberOfDice;
    int total;


    public void diceRollingGame() {

        System.out.println("Welcome to the Dice Rolling Game");
        //get number of dice user wants to roll
        System.out.print("Enter the number of dice you want to roll: ");
        numberOfDice = scanner.nextInt();

         rollDice(numberOfDice);


        System.out.println("Total: " + total);

        scanner.close();
    }

    void rollDice(int numberOfDice) {
        if (numberOfDice > 0 ) {
            for(int  i = 0; i < numberOfDice; i++) {
                int roll = random.nextInt(1, 7);

                System.out.println("You rolled: " + roll);
                total += roll;

                printAsciiArt(numberOfDice);

            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice must be greater than 0 and less than 7");
    }   }

    void printAsciiArt(int numberOfDice) {
        String dice1 = """
                ---------
                |       |
                |   o   |
                |       |
                ---------
                
                """;
        String dice2 = """
                ---------
                | o     |
                |       |
                |     o |
                ---------
                
                """;
        String dice3 = """
                ---------
                | o     |
                |   o   |
                |     o |
                ---------
                
                """;
        String dice4 = """
                ---------
                | o   o |
                |       |
                | o   o |
                ---------
                
                """;
        String dice5 = """
                ---------
                | o   o |
                |   o   |
                | o   o |
                ---------
                
                """;
        String dice6 = """
                ---------
                | o   o |
                | o   o |
                | o   o |
                ---------
                
                """;

        switch (numberOfDice) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

        }
    }
}
