package Codewars.KYU7;

/*
Simple kata, simple rules: your function should accept the inputs 4 and 7.
If 4 is entered, the function should return 7.
If 7 is entered, the function should return 4.
Anything else entered as input should return 0.
There's only one catch, your function cannot include if statements, switch statements, or the ternary operator.
 */

public class Four_Seven {
    public static int cetiriSedam(int n){
        while(n!=4 && n!=7){
            return 0;
        }
        return 11-n;
    }

    public static void main(String[] args) {
        System.out.println(cetiriSedam(4));
    }
}
