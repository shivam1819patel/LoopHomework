import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // read the input number from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // check if the input number is prime
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= 0; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // print the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}