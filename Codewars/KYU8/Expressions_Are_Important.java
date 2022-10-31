package Codewars.KYU8;

/*
Given three integers a ,b ,c,
return the largest number obtained
after inserting the following operators and brackets: +, *, ()
*/

public class Expressions_Are_Important {
        public static int izrazi(int a, int b, int c) {
            return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
        }

    public static void main(String[] args) {
        System.out.println(izrazi(5,4,6));
    }
}
