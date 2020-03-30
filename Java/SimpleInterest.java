import java.util.Scanner;
//test fetch

public class SimpleInterest {

    public static void main(String[] args) {

        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        p = scan.nextFloat();
        System.out.println("Enter the Rate of Interest");
        r = scan.nextFloat();
        System.out.println("Enter the Time Period:");
        t = scan.nextFloat();
        scan.close();

        sinterest = (p * r * t) / 100;
        System.out.println("Simple Interest is: $" + sinterest);
    }
}
