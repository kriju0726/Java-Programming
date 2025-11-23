import java.util.Scanner;

public class LongestPalindrome {

    // Expand-around-center approach: O(n^2) time, O(1) extra space
    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0, end = 0; // inclusive indices of best palindrome found
        for (int i = 0; i < s.length(); i++) {
            // odd-length palindrome (center at i)
            int len1 = expandFromCenter(s, i, i);
            // even-length palindrome (center between i and i+1)
            int len2 = expandFromCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                // compute new start and end using the center i and length len
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // helper: returns length of palindrome expanded from left,right
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // when loop ends, left & right are one step beyond palindrome bounds
        return right - left - 1;
    }

    // main: read input and show result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String best = longestPalindromicSubstring(input);
        System.out.println("Longest palindromic substring: \"" + best + "\"");
        System.out.println("Length: " + best.length());
        sc.close();
    }
}
