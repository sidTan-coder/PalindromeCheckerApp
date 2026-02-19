import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Iterate from the last character to the first (Image Hint)
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append the character at the current index to the new string
            reversed += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Optional: Check if it is a palindrome
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}