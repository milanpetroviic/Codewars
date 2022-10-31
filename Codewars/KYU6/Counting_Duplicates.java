package Codewars.KYU6;

/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

        Example:
        "abcde" -> 0 # no characters repeats more than once
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
        "indivisibility" -> 1 # 'i' occurs six times
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice
*/

import java.lang.Character;

public class Counting_Duplicates {
    static final int NO_OF_CHARS = 256;
    public static void prebrojDuplikate(String txt) {

        int brojac = 0;
        int[] karakter = new int[NO_OF_CHARS];

        for(int i = 0; i < txt.length(); i++){
            karakter[Character.toLowerCase(txt.charAt(i))]++;
        }

        for (int i = 0; i < NO_OF_CHARS; i++) {
            if(karakter[i] > 1) {
                brojac++;
            }
        }
        System.out.println("Broj karaktera koji se ponavlja: " + brojac);
    }
    public static void main(String[] args) {
        prebrojDuplikate("Indivisibilities");
    }
}
