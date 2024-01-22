package leetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input = 121;

        System.out.println(isPalindrome(input));
    }

    // convert int into string strNum
    // reverse strNum revStrNum
    // if revStrNum and strNum are == then the input is palindrome
    public static boolean isPalindrome(int x) {
        String strNum = Integer.toString(x);
        StringBuilder revStrNum = new StringBuilder(strNum).reverse();

        return revStrNum.toString().equals(strNum);
    }
}
