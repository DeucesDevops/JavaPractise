import java.util.Scanner;

public class QuizGame {
    void quizGame() {
        //questions array[]
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"
        };

        //options array[][]
        String[][] options = {
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Sharing files"},
                {"1. CPU", "2. GPU", "3. RAM", "4. Hard drive"},
                {"1. 2004", "2. 2005", "3. 2006", "4. 2007"},
                {"1. Bill Gates", "2. Steve Jobs", "3. Tim Berners-Lee", "4. Charles Babbage"},
                {"1. COBOL", "2. Fortran", "3. Java", "4. C++"}
        };

        //declare variables
        int[] answers = {3, 1, 1, 4, 2};
        int score  = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        //welcome message
        System.out.println("*************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("**************************");
        System.out.println(" ");

        //question(loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(" ");

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.println("Enter your answer: ");
            guess = scanner.nextInt();


            System.out.println("**********");
            if(guess == answers[i]) {
                System.out.println("Correct!");
                System.out.println("**********");
                score++;
            }
            else {
                System.out.println("Incorrect!");
                System.out.println("**********");
            }

        }

        System.out.println("Your total score is: " + score);

        //display question
        //display options
        //prompt user to enter answer
        //check answer
        //display result
        //display score

        scanner.close();
    }

}

