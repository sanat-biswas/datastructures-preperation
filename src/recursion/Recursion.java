package recursion;

public class Recursion {

    public static void main(String[] args) {
        printNumbers(1);
    }

    static void printNumbers(int n) {

        if (n > 5) {
            return;
        }

        System.out.println(n);
         printNumbers(n + 1);
//        System.out.println(n);

    }
}
