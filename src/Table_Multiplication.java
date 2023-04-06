import java.util.Scanner;

public class Table_Multiplication
{
    //Main method
    public static void main(String[] args)
    {
        //create scanner class object
        Scanner scanner=new Scanner(System.in);
        // print for user
        System.out.println("Enter number");
        //create variable and using scanner object
        int a = scanner.nextInt();

        //for loop syntex
        for (int i = 1; i <= 12; i++)
        {
            //print for multiplication
            System.out.println(i + "x" + a + "=" + (i * a));
        }

    }
}




