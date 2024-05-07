// it can check the string is plindrome or not.



public class PalindromeChecker {
    public static void main(String[] args) {
        // Check if 5 arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide 5 words as command line arguments.");
            return;
        }
        
        // Loop through each word
        for (String word : args) {
            // Reverse the word
            String reversedWord = reverseWord(word);
            
            // Check if the reversed word is a palindrome
            if (isPalindrome(reversedWord)) {
                System.out.println(reversedWord + " is a palindrome.");
            } else {
                System.out.println(reversedWord + " is not a palindrome.");
            }
        }
    }
    
    // Method to reverse a word
    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
    
    // Method to check if a word is a palindrome
    private static boolean isPalindrome(String word) {
        return word.equals(reverseWord(word));
    }
}
