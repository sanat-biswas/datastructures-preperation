package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {

    public static void main(String[] args) {

        String s = "abc";
        permutation("", s);

        ArrayList<String> ans = permutationList("", s);
        System.out.println(ans);
    }

    static void permutation(String p, String un) {
        if(un.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);

        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutation(f + ch + s, un.substring(1));
        }
    }

    //using arraylist
    static ArrayList<String> permutationList(String p, String un) {
        if(un.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = un.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            ans.addAll(permutationList(f + ch + s, un.substring(1)));
        }

        return ans;
    }
}
