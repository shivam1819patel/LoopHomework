import java.util.Scanner;

public class Natural_Number_With_Sum {
    public static void main(String[] args) {


        int i, n, sum = 0;
        {
            //sout for user to enter number
            System.out.println("Enter Number:");
            //create scanner class object
            Scanner in = new Scanner(System.in);
            //create variable and using scanner object
            n = in.nextInt();
            //sout for print n natural numbers
            System.out.println("The first n natural numbers are: " + n);
            //For loop syntex
            for (i = 1; i <= n; i++) {
                sum = sum + i;
            }
            //sout for sum of numbers
            System.out.println("The Sum of natural numbers upto " + n+" terms : " + sum);
        }
    }
}