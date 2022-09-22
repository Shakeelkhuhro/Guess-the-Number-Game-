import java.util.Scanner;
import java.util.Random;

class Game {
    public int number;
    public int inputNo;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        noOfGuesses = noOfGuesses;
    }

    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNo = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNo == number) {
            System.out.format("Yes, you guessed it right, it was %d\nYou guessed it %d attempts ", number,
                    noOfGuesses);
            return true;
        } else if (inputNo < number) {
            System.out.println("Too low...");
        } else if (inputNo > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Game1 {
    public static void main(String[] args) {
        /*
         * create a class which allows a user to play "guess the number" game once
         * game should have following methods
         * 1. constructor to generate the random number
         * 2. takeUserInput() to take a number user input number
         * 3. isCorrectNumber() detect wther a number is entered by the user is true/
         * false
         * 4. geeter and setter for noOfGuesses
         * Use peroperties such as numberOfGuess(int), etc to get thois task done!
         */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}
