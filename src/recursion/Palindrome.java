package recursion;

public class Palindrome {

    public static void main(String[] args) {
        boolean ans = checkPalindromeWithoutRecursion(1201);
        System.out.println(ans);

        boolean pal = checkPalindromeWithRecursion(1211);
        System.out.println(pal);
    }

    static boolean checkPalindromeWithoutRecursion(int n) {
        int rev = 0;
        int temp = n;

        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        System.out.println(rev);
        System.out.println(n);
        return rev == temp;
    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;

        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean checkPalindromeWithRecursion(int n) {
        return n == rev(n);
    }
}
