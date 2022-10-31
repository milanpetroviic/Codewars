package Codewars.KYU7;

/*
Write a program to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 */

import java.util.Scanner;

public class Square_Every_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int broj = sc.nextInt();
        int cifra;
        String rezultat = "";


        while (broj != 0) {
            cifra = broj % 10;
            rezultat = cifra * cifra + rezultat;
            broj /= 10;
        }

        System.out.println(Integer.parseInt(rezultat));
    }
}
