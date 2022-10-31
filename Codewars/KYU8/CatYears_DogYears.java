package Codewars.KYU8;

//        I have a cat and a dog.
//        I got them at the same time as kitten/puppy. That was humanYears years ago.

//        NOTES:
//        humanYears >= 1
//        humanYears are whole numbers only

//        Cat Years:
//        15 cat years for first year
//        +9 cat years for second year
//        +4 cat years for each year after that

//        Dog Years:
//        15 dog years for first year
//        +9 dog years for second year
//        +5 dog years for each year after that

import java.util.Scanner;

public class CatYears_DogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite godine ljudi: ");
        int godineLjudi = scanner.nextInt();

        int godineMacaka = 0;
        int godinePasa = 0;

            if (godineLjudi == 1) {
                godineMacaka = 9;
                godinePasa = 9;
            } else if (godineLjudi == 2) {
                godineMacaka = 24;
                godinePasa = 24;
            } else if (godineLjudi >= 3) {
                godineMacaka = 24;
                godinePasa = 24;
                for (int j = 3; j <= godineLjudi; j++) {
                    godineMacaka += 4;
                    godinePasa += 5;
                }
            }
        System.out.println("Godine macaka pretvorene u godine ljudi: " + godineMacaka);
        System.out.println("Godine pasa pretvorene u godine ljudi: " + godinePasa);
    }
}
