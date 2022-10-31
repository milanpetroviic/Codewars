package Codewars.KYU8;

/*
Given a month as an integer from 1 to 12,
return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter;
month 6 (June), is part of the second quarter;
and month 11 (November), is part of the fourth quarter.
*/

import java.util.Scanner;

public class Quarter_Of_The_Year {
    public static int cetvrtinaGodine() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Unesite broj zeljenog meseca u godini: ");
            int mesec = scanner.nextInt();

            return (mesec + 2) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Uneti mesec pripada " + cetvrtinaGodine() + ". cetvrtini godine.");
    }
}
