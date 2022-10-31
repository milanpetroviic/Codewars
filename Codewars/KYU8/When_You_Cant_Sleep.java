package Codewars.KYU8;

/*Given a non-negative integer, 3 for example,
return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.
 */

import java.util.Scanner;

public class When_You_Cant_Sleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = scanner.nextInt();

        for (int i = 1; i <= broj; i++){
            System.out.print(i + " sheep...");
        }
    }
}
