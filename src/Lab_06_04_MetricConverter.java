import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        // variable declarations
        double meters = 0.0; // var that stores input
        double miles = 0.0; // var that stores calculates and is outputted
        double feet = 0.0; // var that stores calculates and is outputted
        double inches = 0.0; // var that stores calculates and is outputted
        String trash = ""; // var that stores input if user makes a mistake
        Scanner in = new Scanner(System.in); // sets up scanner class
        System.out.print("Enter a measurement in meters: "); // prompts user
        if (in.hasNextDouble()) // tests if the inputted value is a double
        {
            meters = in.nextDouble(); // stores input in this variable if the test passes
            in.nextLine(); // clears buffer
        }
        else
        {
            trash = in.nextLine(); // stores input in this variable if the test is failed
            System.out.println("Must enter valid value for measurement in meters " + trash); // output to show user their mistake
        }
        miles = meters/1609.344; // calculates number of miles
        System.out.println(meters + " meters in miles is " + miles); // outputs result
        feet = meters*3.28084; // calculates number of feet
        System.out.println(meters + " meters in feet is " + feet); // outputs result
        inches = meters*39.3701; // calculates inches
        System.out.println(meters + " meters in inches is " + inches); // outputs result

    }
}
