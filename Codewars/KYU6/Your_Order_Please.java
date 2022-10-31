package Codewars.KYU6;

/*
Your task is to sort a given string.
Each word in the string will contain a single number.
This number is the position the word should have in the result.

        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

        If the input string is empty, return an empty string.
        The words in the input String will only contain valid consecutive numbers.

        Examples
        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
        ""  -->  ""
 */

import java.util.*;

public class Your_Order_Please {
    public static String narudzbina(String string) {
            List<Character> brojevi = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            StringTokenizer st = new StringTokenizer(string);
            String[] nizReci = new String[st.countTokens()];

            while (st.hasMoreTokens()) {
                String trenutnaRec = st.nextToken();
                for (int i = 0; i < trenutnaRec.length(); i++) {
                    if (brojevi.contains(trenutnaRec.charAt(i))) {
                        nizReci[brojevi.indexOf(trenutnaRec.charAt(i))] = trenutnaRec;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String s: nizReci) {
                sb.append(s).append(' ');
            }
            return sb.toString().trim();
        }

    public static void main(String[] args) {
        System.out.println(narudzbina("is2 Thi1s T4est 3a"));
        System.out.println("4of Fo1r pe6ople g3ood th5e the2");
    }
}


