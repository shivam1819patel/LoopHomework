import java.util.Scanner;

public class Number_10_Input {
    //Main method
    public static void main(String[] args) {


        {
            //create scanner class object
            Scanner scanner = new Scanner(System.in);
            // print for user
            System.out.println("Enter first number");
            //create variable and using scanner object
            int n1 = scanner.nextInt();
            System.out.println("Enter second number");
            int n2 =scanner.nextInt();
            //for loop syntex
            for (int i = n1; i <= n2; i++ )
            {
                System.out.println(i);
            }
        }
    }
}