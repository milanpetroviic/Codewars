package Codewars.KYU5;

/*
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
 The function should return true if the string is valid, and false if it's invalid.

Examples
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true

 */

public class Valid_Parentheses {
    public static boolean validParentheses(String parentheses) {
        while (parentheses.contains("(") && parentheses.contains(")")) {
            parentheses = parentheses.replaceAll("\\([^()]*\\)", "");
            if (!parentheses.matches(".*\\(+.*\\)+.*"))
                break;
        }
        return !parentheses.contains("(") && !parentheses.contains(")");
    }

    public static void main(String[] args) {
        System.out.println(validParentheses("((((("));
    }
}
