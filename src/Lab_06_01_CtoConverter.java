import java.util.Scanner;

public class Lab_06_01_CtoConverter {
    public static void main(String[] args) {
      // variable declarations
        int inputtedCTemp = 0; // var to store input
        int tempInF = 0; // var which is outputted
        String trash = ""; // var if user makes a mistake
        Scanner in = new Scanner(System.in); // sets up scanner class
        System.out.print("Enter temperature in Celsius: "); // prompt to user
        if(in.hasNextInt()) // tests if input is an integer
        {
            inputtedCTemp = in.nextInt(); // if test passes the input is stored in the variable
            in.nextLine(); // clears buffer
        }
        else // inputted value is not an integer
        {
            trash = in.nextLine(); // if test fails the input is stored in this variable
            System.out.println("Must enter valid temperature:" + trash); // output to tell user the mistake
        }
        tempInF = ((inputtedCTemp*9)/5) + 32; //  finds the conversion of C into F
        System.out.println(inputtedCTemp + " Degrees Celsius in Fahrenheit is " + tempInF + " Degrees."); // outputs the conversions

    }
}