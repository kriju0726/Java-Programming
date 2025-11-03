public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        // Negative numbers are not palindromes
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;           // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            n = n / 10;                   // remove last digit
        }

        // Check if reversed number equals the original
        return original == reversed;
    }

    public static void main(String[] args) {
        int N = 121; // you can test with other numbers too

        if (isPalindrome(N))
            System.out.println(N + " is a palindrome.");
        else
            System.out.println(N + " is not a palindrome.");
    }
}
