public class Reverse {

    public static void main(String[] args) {
        int ans = reverseNumberWithoutRecursion(12343021);
        System.out.println(ans);
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
}
