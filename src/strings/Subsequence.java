package strings;

public class Subsequence {

    public static void main(String[] args) {
        String s = "abc";
        printSubSeq("", s);
    }

    static void printSubSeq(String p, String un) {
        if(un.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);

        printSubSeq(p + ch, un.substring(1));
        printSubSeq(p, un.substring(1));
    }
}
