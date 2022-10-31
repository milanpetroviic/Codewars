package Codewars.KYU5;

/*
Write a program that will calculate the number of trailing zeros in a factorial of a given number.
N! = 1 * 2 * 3 *  ... * N
Be careful 1000! has 2568 digits...

Examples:

zeros(6) = 1
# 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
zeros(12) = 2
# 12! = 479001600 --> 2 trailing zeros

Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.
 */
public class Number_Of_Trailing_Zeros_Of_N {
        public static int zeros(int n) {

            int numOfZeros = 0;

            while(n!= 0){
                numOfZeros += (int)Math.floor(n / 5);
                n /= 5;
            }
            return numOfZeros;
        }

    public static void main(String[] args) {
        System.out.println(zeros(5));
    }
}
