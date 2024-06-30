//.  Some websites impose certain rules for passwords.
//  Write a method that checks whether a string is a valid password. 
//  Suppose the password rules are as follows: A password must have at least eight characters.
//   A password consists of only letters and digits. A password must contain at least two digits. 
//   Write a program that prompts the user to enter a password and displays Valid Password if 
//   the rules are followed or Invalid Password otherwise.


import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (char ch : password.toCharArray()) {
            // Check if the character is a letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                return false; // If the character is neither a letter nor a digit, the password is invalid
            }
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            return false;
        }
        return true;
    }
}
