package recursion;

public class NumberOfDigits {

    public static void main(String[] args) {
        System.out.println(noOfDigitsWithRec(1023));
    }

    static int noOfDigits(int num) {
        int count = 0;
        while(num > 0) {
            int temp = num % 10;
            count ++;
            num /= 10;
        }

        return count;

    }

    static int noOfDigitsWithRec(int n) {
        if(n == 0) {
            return 0;
        }

        return 1 + noOfDigitsWithRec(n / 10);
    }
}
