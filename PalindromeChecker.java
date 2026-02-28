class Palindrome {

    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

 public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        Palindrome checker = new Palindrome();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);

        if (result) {
            System.out.println("Result : The string is a Palindrome");
        } else {
            System.out.println("Result : The string is NOT a Palindrome");
        }
    }
}