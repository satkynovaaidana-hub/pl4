public class PalindromeChecker {

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Output: Not Palindrome");
        }
    }
}