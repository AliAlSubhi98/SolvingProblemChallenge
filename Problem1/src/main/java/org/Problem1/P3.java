package org.Problem1;

import java.util.Arrays;
import java.util.HashMap;

/*Problem: Given two strings s and t, determine if they are isomorphic. Two strings
        are isomorphic if the characters in s can be replaced to get t.
        For example, "egg" and "add" are isomorphic, "foo" and "bar" are not.*/
public class P3 {

    public static boolean Solve(String string1,String string2) {

        if(string1.length() != string2.length()){
            System.out.println("not isomorphic");
            return false;
        }
        HashMap<Character,Character> counts = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < string1.length(); i++) {
            if(counts.containsKey(string1.charAt(i))){
                c = counts.get(string1.charAt(i));
                if(c != string2.charAt(i)){
                    System.out.println("not isomorphic");
                    return false;
                }
            } else if (!counts.containsValue(string2.charAt(i))) {
                counts.put(string1.charAt(i),string2.charAt(i));
            }
            else {
                System.out.println("not isomorphic");
                return false;
            }
        }
        System.out.println("isomorphic");
        return true;
    }
}



