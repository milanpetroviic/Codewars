package Codewars.KYU6;

/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.

        Examples:
        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
        spinWords( "This is a test") => returns "This is a test"
        spinWords( "This is another test" )=> returns "This is rehtona test"
 */

import java.util.*;

public class Stop_GninnipS_My_SdroW {
    public static String zavrtetiReci(String recenica) {
        String obrnuto;
        String[] niz = recenica.split(" ");
        for (int i = 0; i <= niz.length - 1; i++) {
            niz[i] = niz[i].length() >= 5 ? niz[i] = new StringBuffer(niz[i]).reverse().toString() : niz[i];
        }
        obrnuto = Arrays.toString(niz);
        return obrnuto.substring(1, obrnuto.length() - 1).replaceAll(",", "");
    }

    public static void main(String[] args) {
        System.out.println(zavrtetiReci("Hey fellow warriors"));
    }
}

