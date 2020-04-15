import java.util.Scanner;

public class PositiveOrNegative {
    public static void main (String [] args) {
        //create a scanner object to readin from user
        Scanner input = new Scanner(System.in);
        // prompt user for a number
        System.out.print("Test Data\nEnter a number: ");
        // assign the input to a variable
        int num = input.nextInt();
        //check with if else statement
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0){
            System.out.println(num + " is negative");
        } else System.out.println(num + " is zero");
    }
}
