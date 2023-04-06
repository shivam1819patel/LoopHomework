import java.util.Scanner;

public class Sum_Natural_Numbers
{
    //Main method
    public static void main(String[] args)
    {
        int i,lim,sum=0;
        //sout for user to enter number
        System.out.println("Enter Number:");
        //create scanner class object
        Scanner sc=new Scanner(System.in);
        //create variable and using scanner object
        lim=sc.nextInt();
        //For loop syntex
        for(i=1;i<=lim;i++)
    {
        sum=sum+i;
    }
        //sout for sum of numbers
        System.out.println("The Sum Is: "+sum);
}
}
