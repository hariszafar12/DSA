package DSA;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        // Base cases
        if (str.length() <= 1) {
            return true; // A string of length 0 or 1 is always a palindrome
        }

        // Recursive case: check the first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursively check the substring that excludes the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        // If the first and last characters don't match, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.isPalindrome("racecar")); // Output: true
        System.out.println(checker.isPalindrome("hello"));   // Output: false
    }
}
