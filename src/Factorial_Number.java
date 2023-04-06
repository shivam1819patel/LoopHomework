import java.util.Scanner;

public class Factorial_Number
{
    //Main method
    public static void main(String[] args) {


        //Take input from the user and create instance of scanner class
        Scanner sc = new Scanner(System.in);
        //sout for user to enter number
        System.out.println("Enter the number: ");
        //Declare and Initialize the variable
        int num = sc.nextInt();
        int fact = 1;
        //For loop syntex
        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        //sout to print factorial number
        System.out.println("Factorial of the number: " + fact);
    }
}