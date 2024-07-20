package strings;

public class ReplaceString {
    public static void main(String[] args) {
        String s = "baccad";
        replaceString("", s);

        System.out.println(replaceStringWithRecursion(s));
    }

    static void replaceString(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        if(ch == 'a') {
            replaceString(processed, unprocessed.substring(1));
        } else {
            replaceString(processed + ch, unprocessed.substring(1));
        }
    }

    static String replaceStringWithRecursion(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a')
            return replaceStringWithRecursion(unprocessed.substring(1));
        return ch + replaceStringWithRecursion(unprocessed.substring(1));
    }
}
