import java.util.Stack;
import java.util.Scanner;

public class PalindromeStack {

    public static void main(String[] args) {

        System.out.println("Enter word:");
        Scanner scan = new Scanner(System.in);
        
        String inputString = scan.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (inputString.equals(reverseString)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome.")
        }
    }
}