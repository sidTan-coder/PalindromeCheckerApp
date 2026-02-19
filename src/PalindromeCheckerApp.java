import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        // Declare and initialize the input string.
        String input = sc.nextLine();

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()){
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);

        sc.close();
    }
}