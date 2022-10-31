package Codewars.KYU8;

//  Write a program to convert a name into initials. This kata strictly takes two words with one space in between them.
//  The output should be two capital letters with a dot separating them

//   Example
//   Sam Harris => S.H
//   Patrick Feeney => P.F

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime i prezime: ");
        String nameAndSurename = sc.nextLine();

        String[] arrOfnameAndSurename = nameAndSurename.split(" ");
        String ime = arrOfnameAndSurename[0].toUpperCase();
        String prezime = arrOfnameAndSurename[1].toUpperCase();

        char prviInicijal = ime.charAt(0);
        char poslednjiInicijal = prezime.charAt(0);

        System.out.println(prviInicijal + "." + poslednjiInicijal);
    }
}
