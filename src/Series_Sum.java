import java.util.Scanner;

public class Series_Sum
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = scanner.nextInt();


        double sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += 1.0 / i;

        }

        System.out.println("The sum of the series is: " + sum);

    }
}
