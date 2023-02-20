import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        //variable declarations
        int numberOfGallonsInTank = 0; // var to store input
        int milesPerGallon = 0; // var to store input
        double gasPricePerGallon = 0.0; // var to store input
        double hundredMileCost = 0.0; // var to store calculations and be outputted
        int milesCarCanTravel = 0; // var to store calculations and be outputted
        String trash = ""; // var if the user makes a mistake
        Scanner in = new Scanner(System.in); // sets up scanner class
        System.out.print("Enter number of gallons of gas in tank: "); // prompts the user
        if (in.hasNextInt()) // tests if inputted value is an integer
        {
            numberOfGallonsInTank = in.nextInt(); // the input is stored in this variable if test is passed
            in.nextLine(); // clears buffer
        }
        else // inputted value is not an integer
        {
            trash = in.nextLine(); // input is stored in this variable if test fails
            System.out.println("Must enter a valid number for gallons in tank " + trash); // outputs to show the user their mistake
        }

        System.out.print("Enter fuel efficiency in miles per gallon: "); // prompts the user
        if (in.hasNextInt()) // tests if inputted value is an integer
        {
            milesPerGallon = in.nextInt(); // the input is stored in this variable if test is passed
            in.nextLine(); // clear buffer
        }
        else  // inputted value is not an integer
        {
            trash = in.nextLine(); // input is stored in this variable if test fails
            System.out.println("Must enter a valid number for fuel efficiency " + trash); // outputs to show the user their mistake
        }
        System.out.print("Enter gas price per gallon: "); // prompts the user to enter input
        if (in.hasNextDouble()) // tests if inputted value is a double value
        {
            gasPricePerGallon = in.nextDouble(); // input is stored in this variable if test is passed
            in.nextLine(); // clear buffer
        }
        else // input is not a double value
        {
            trash = in.nextLine(); // input is stored in this variable if test fails
            System.out.println("Must enter valid value for gas price " + trash); //outputs to show the user their mistake
        }
    hundredMileCost = 100/milesPerGallon; // calculates number of gallons needed to travel 100 miles
    hundredMileCost = gasPricePerGallon*hundredMileCost; // calculates hundred mile cost
        System.out.println("It will cost $" + hundredMileCost + " to travel a hundred miles."); // outputs cost
milesCarCanTravel = milesPerGallon*numberOfGallonsInTank; // calculates how many more miles car can travel
        System.out.println("The car can travel " + milesCarCanTravel + " more miles with the amount of fuel it has left."); // outputs result

    }
}
