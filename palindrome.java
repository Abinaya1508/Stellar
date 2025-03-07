import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        String s = sc.next();  // Read input string
        String rev = "";  // Initialize empty string

        // Reverse the string using a for loop
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        // Compare using .equals() instead of ==
        if (s.equals(rev)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();  // Close the scanner to avoid resource leaks
    }
}
