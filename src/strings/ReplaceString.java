package strings;

public class ReplaceString {
    public static void main(String[] args) {
        String s = "baccad";
        replaceString("", s);
    }

    static void replaceString(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        if(ch == 'a') {
            replaceString(processed, unprocessed.substring(1));
//            System.out.println(processed + " pr");
        } else {
            replaceString(processed + ch, unprocessed.substring(1));

//            System.out.println(processed + " processed");
        }
    }
}
