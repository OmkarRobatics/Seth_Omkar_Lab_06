import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        // variable declarations
       double side1Length = 0.0; // variable to store input
       double side2Length = 0.0; // variable to store input
       double diagonalLength = 0.0; // variable to store calculated value and be outputted
       double area = 0.0; // variable to store calculated value and be outputted
       double perimeter = 0.0; // variable to store calculated value and be outputted
       String trash = ""; // variable to store input if user makes a mistake

       Scanner in = new Scanner(System.in); // sets up scanner class

       System.out.print("Enter the length of the first side: "); // prompts the user
       if (in.hasNextDouble()) // tests if the input is a double value
       {
           side1Length = in.nextDouble(); // value is stored in this variable if test is passed
           in.nextLine(); //clears buffer
       }
       else
       {
           trash = in.nextLine(); // value is stored in this variable if test is failed
           System.out.println("Must enter a valid value for side 1 " + trash); // outputs to show user mistake
       }

       System.out.print("Enter the length of the second side: "); // prompts user
       if(in.hasNextDouble()) // tests if input is a double value
       {
           side2Length = in.nextDouble(); // stores input in this variable if test is passed
           in.nextLine(); // clear buffer
       }
       else {
           trash = in.nextLine(); // stores input in this variable if test is failed
           System.out.println("Must enter valid value for length of side 2 " + trash); // outputs to show user their mistake
       }

        perimeter = side1Length * 2 + side2Length * 2; // calculates perimeter
        System.out.println("The perimeter of the rectangle is " + perimeter); // output perimeters
        area = side1Length*side2Length; // calculates area
        System.out.println("The area of the rectangle is " + area); // outputs area
        diagonalLength = Math.sqrt(side1Length*side1Length + side2Length*side2Length); // calculates diagonal length
        System.out.println("The length of the diagonal of the rectangle is " + diagonalLength); // outputs diagonal length
    }
}
