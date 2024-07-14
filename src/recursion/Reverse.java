package recursion;

public class Reverse {

    public static void main(String[] args) {
        int ans = reverseNumberWithoutRecursion(12343021);
        int recAns = reverseNumberWithRecursion(12343021, 0); //initial value for rev = 0
        int revAns = rev(12343021);
        System.out.println(revAns);
        System.out.println(ans);
        System.out.println(recAns);
    }

    static int reverseNumberWithoutRecursion(int n) {
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        return rev;
    }

    static int reverseNumberWithRecursion(int n, int rev) {
        if(n == 0) {
            return rev;
        }

        return reverseNumberWithRecursion(n / 10, rev * 10 + n % 10);
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
}
