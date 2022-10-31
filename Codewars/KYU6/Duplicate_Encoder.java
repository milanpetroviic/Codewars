package Codewars.KYU6;

/*
The goal of this exercise is to convert a string to a new string where each character
in the new string is "(" if that character appears only once in the original string, or ")"
if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.

        Examples:
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
 */

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Encoder {
    public static String kodirati(String izraz) {
        Map<Character, Integer> map = new HashMap<>();
        izraz = izraz.toLowerCase();

        for(int i = 0; i < izraz.length(); i++){
            if(map.containsKey(izraz.charAt(i))){
                int value = map.get(izraz.charAt(i));
                map.remove(izraz.charAt(i));
                map.put(izraz.charAt(i), ++value);
            } else {
                map.put(izraz.charAt(i), 1);
            }
        }

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < izraz.length(); i++){
            output.append((map.get(izraz.charAt(i)) > 1) ? ")" : "(");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(kodirati("1231456"));
    }
}

