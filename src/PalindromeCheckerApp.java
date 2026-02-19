import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int n = input.length();

        // Loop only till half of the string length.
        for (int i = 0; i < n / 2; i++) {
            // Compare character at index i with its mirrored character at the end
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is it a Palindrome? : true");
        }else {
            System.out.println("Is it a Palindrome? : false");
        }

        sc.close();
    }
}
