import java.util.Scanner;

public class MultiplyNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        int product = num1 * num2;

        scan.close();

        System.out.println("The product is " + product);


    }
}