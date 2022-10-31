package Codewars.KYU6;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).
Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class Multiples_Of_3_Or_5 {
    public static void nadjiVisestruke(int broj) {
        int zbir = 0;

        for (int i = 1; i <= broj; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Broj " + i + " je deljiv i sa 3 i sa 5.");
                zbir += i;
            }
            else if (i % 3 == 0) {
                System.out.println("Broj " + i + " je deljiv sa 3.");
                zbir += i;
            }
            else if (i % 5 == 0) {
                System.out.println("Broj " + i + " je deljiv sa 5.");
                zbir += i;
            }
            else
                System.out.println("Broj " + i + " nije deljiv ni sa 3 ni sa 5.");
        }

        System.out.println("Zbir brojeva od " + broj + " do 0, koji su deljivi sa 3 ili sa 5, je: " + zbir + ".");
    }

    public static void main(String[] args) {
        nadjiVisestruke(20);
    }
}

