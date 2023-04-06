import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number: ");
        //for capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //Using For loop
        for (; num != 0; ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        //using Sout to print reverse number
        System.out.println("Reverse of specified number is: " + reversenum);
    }
}