package recursion;

public class CountZeroes {

    public static void main(String[] args) {

        int ans =  countZeroesWithoutRecursion(120001);
        System.out.println(ans);

        int recAns = countZeroesWithRecursion(12000100);
        System.out.println(recAns);
    }

    static int countZeroesWithoutRecursion(int n) {
        int count = 0;

        while ( n!= 0) {
            int rem = n % 10;
            if (rem == 0) {
                count ++;
            }
            n = n / 10;
        }
        return count;
    }



    static int countZeroesWithRecursion(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if(n == 0) {
            return c;
        }

        int rem = n % 10;
        if(rem == 0) {
            return helper(n / 10, c + 1);
        }

        return helper(n / 10, c);
    }


}
