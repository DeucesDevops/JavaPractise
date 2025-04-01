import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public void slotMachine() {
        Scanner scanner = new Scanner(System.in);



        //declare variables
        int balance  = 100;
        int bet;
        int payout;
        String[]row;
        String playAgain;

        //display welcome message
        System.out.println("***************************");
        System.out.println("WELCOME TO THE SLOT MACHINE");
        System.out.println("Symbols: 🍒, 🍉, 🍋, 🔔, 🌟");
        System.out.println("*****************************");

        //play if balance > 0
        while (balance > 0) {
            System.out.println("Your balance is: " + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("Insufficient balance");
                continue;
            } else if (bet <= 0) {
                System.out.println("bet must be greater than 0");
                continue;
            }
            else {
                balance -= bet;
                System.out.println("£" + bet);
                System.out.println("Current balance: " + balance);
            }

            System.out.println("Spinning...");

            row = spinRow();

            printRow(row);
            payout =getPayout(row, bet);

            if(payout > 0){
                System.out.println("Congratulations! You won: " + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry, you lost");
            }

            System.out.println("Play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println(" ");
        System.out.println("GAME OVER! Your final balance is: " + balance);

        //enter bet amount
        //   verify if bet amount > balance
        //   verify if bet > 0
        //   subtract bet amount from balance
        // spin row
        //print row
        //get payout
        // ask to play again
        //goodbye message

        scanner.close();
    }

    int getPayout(String[] row, int bet) {

        if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

    String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "🌟"};
        Random random = new Random();
        String[] row = new String[3];

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    void printRow(String[] row) {
        System.out.println("----------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("-----------------");
    }
}
