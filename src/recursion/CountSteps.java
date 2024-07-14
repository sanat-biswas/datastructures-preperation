package recursion;

public class CountSteps {

    public static void main(String[] args) {
        System.out.println(countStepWithoutRecursion(14));

        int ans = numberOfSteps(14);
        System.out.println(ans);
    }

    static int countStepWithoutRecursion(int n) {
        int steps = 0;

        while( n != 0) {

            if (n % 2 == 0) {
                n = n / 2;
            }else {
                n -= 1;
            }
            steps++;
        }

        return  steps;
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);    //0 initial number of steps
    }

    private static int helper(int n, int steps) {
        if(n == 0) {
            return steps;
        }

        if(n % 2 == 0) {
            return helper(n / 2, steps + 1);
        }
        return helper(n - 1, steps + 1);
    }
}
