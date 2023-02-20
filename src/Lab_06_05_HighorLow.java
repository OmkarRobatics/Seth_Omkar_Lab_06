import java.util.Random;
import java.util.Scanner;

public class Lab_06_05_HighorLow {
    public static void main(String[] args) {
        int guess = 0; // var to store input
        String trash = ""; // var to store in put if user makes a mistake
        Random generator = new Random(); // sets up random class
        int val = generator.nextInt(10) + 1; // generates random number and stores it in a variable
        Scanner in = new Scanner(System.in); // sets up scanner class
        System.out.print("Enter a guess for a number between 1 and 10 inclusive: "); // prompts user
        if (in.hasNextInt()) // tests if input is an integer
        {
            guess = in.nextInt(); // stores input in this var if test is passed
            in.nextLine(); // clears buffer
        }
        else
        {
            trash = in.nextLine(); // stores input in this variable if test is failed
            System.out.println("Must enter valid guess " + trash); // outputs to show user their mistake
        }

        if (guess > val) // tests if guess is greater than number
        {
            System.out.println("Your guess was to high. The correct answer was: " + val); // outputs if test passes
        }
        else if (guess < val) // tests if guess is less than number
        {
            System.out.println("Your guess was to low. The correct answer was: " + val); // output if test passes
        }
        else // number is equal to guess
        {
            System.out.println("Your guess is correct!"); // outputs user is correct
        }
    }
}
