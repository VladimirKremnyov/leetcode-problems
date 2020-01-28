package problems;

public class Palindrome {
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length - 1 && j > i; i++, j--) {
            if(chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(123321));
    }
}
