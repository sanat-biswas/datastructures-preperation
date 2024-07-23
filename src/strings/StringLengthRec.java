package strings;

public class StringLengthRec {

    public static void main(String[] args) {
        System.out.println(lengthStr("abc"));
    }

    static int lengthStr(String str) {
        if(str.isEmpty()) {
            return 0;
        }

        return 1 + lengthStr(str.substring(1));
    }
}
