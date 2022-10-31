package Codewars.KYU7;

/*
Complete the function that takes an odd integer (0 < n < 1000000)
which is the difference between two consecutive perfect squares,
and return these squares as a string in the format "bigger-smaller"

Examples
9  -->  "25-16"
5  -->  "9-4"
7  -->  "16-9"
*/

public class Find_The_Squares {
    public static String pronadjiKvadrate(int n) {
        int x = (n + 1) / 2;
        int y = x - 1;
        return String.format("%d---%d", x * x, y * y);
    }

    public static void main(String[] args) {
        System.out.println(pronadjiKvadrate(5));
    }
}
