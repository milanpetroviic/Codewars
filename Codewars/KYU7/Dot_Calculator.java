package Codewars.KYU7;

/*
You have to write a calculator that receives strings for input.
The dots will represent the number in the equation.
There will be dots on one side, an operator, and dots again after the operator.
The dots and the operator will be separated by one space.

Here are the following valid operators:
+ Addition
- Subtraction
* Multiplication
/ Integer Division

Your Work (Task):
You'll have to return a string that contains dots, as many the equation returns.
If the result is 0, return the empty string.
When it comes to subtraction, the first number will always be greater than or equal to the second number.

        Examples (Input => Output):
        * "..... + ..............." => "...................."
        * "..... - ..."             => ".."
        * "..... - ."               => "...."
        * "..... * ..."             => "..............."
        * "..... * .."              => ".........."
        * "..... // .."             => ".."
        * "..... // ."              => "....."
        * ". // .."                 => ""
        * ".. - .."                 => ""
 */

import java.util.Scanner;

public class Dot_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi teks sa znakom(+,-,*,/): ");
        String txt = scanner.nextLine();
        System.out.println("Unesite drugi tekst: ");
        String txt2 = scanner.nextLine();
        String[] array = txt.split(" ");
        String[] array2 = txt2.split(" ");

        int a = array[0].length();
        int b = array2[0].length();
        int total = 0;

        if(txt.contains("+")) total += a + b;
        if(txt.contains("-")) total += a - b;
        if(txt.contains("*")) total += a * b;
        if(txt.contains("/")) total += a / b;

        String result = "";

        while(total > 0){
            result += ".";
            total--;
        }
        System.out.println("'" + result + "'");
    }
}

