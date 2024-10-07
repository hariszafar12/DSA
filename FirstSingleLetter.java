package DSA;
public class FirstSingleLetter {

    // Method to find the first character that occurs only once
    public static char firstSingleLetter(final char[] text, final int n) {
        // Outer loop iterates through each character in the array
        for (int i = 0; i < n; i++) {
            char current = text[i];
            int count = 0;

            // Inner loop counts how many times 'current' appears in the array
            for (int j = 0; j < n; j++) {
                if (text[j] == current) {
                    count++;
                }
            }

            // If 'current' appears exactly once, return it
            if (count == 1) {
                return current;
            }
        }

        // If no unique character is found, return a null character ('\0')
        return '\0';
    }

    public static void main(String[] args) {
        // Example input as a character array
        final char[] text = "ALGORITHM".toCharArray();
        final int n = text.length;

        // Find and print the first non-repeating character
        char result = firstSingleLetter(text, n);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No single occurrence character found.");
        }
    }
}
