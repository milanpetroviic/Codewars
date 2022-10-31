package Codewars.KYU5;

/*
The rgb function is incomplete.
Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
Valid decimal values for RGB are 0 - 255.
Any values that fall out of that range must be rounded to the closest valid value.

        Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

        The following are examples of expected output values:

        RgbToHex.rgb(255, 255, 255) // returns FFFFFF 1111 1111
        RgbToHex.rgb(255, 255, 300) // returns FFFFFF
        RgbToHex.rgb(0, 0, 0)       // returns 000000
        RgbToHex.rgb(148, 0, 211)   // returns 9400D3 10010100
 */

import java.util.Scanner;

public class RGB_To_Hex_Conversion {
        static String RGB(int n) {
            char[] hexa = new char[2];

            int i = 0;
            while (n != 0) {

                int temp;
                temp = n % 16;

                if (temp < 10) {
                    hexa[i] = (char) (temp + 48);
                }
                else {
                    hexa[i] = (char) (temp + 55);
                }

                i++;
                n = n / 16;
            }

            String hexCode = "";
            if (i == 2) {
                hexCode+=hexa[0];
                hexCode+=hexa[1];
            }
            else if (i == 1) {
                hexCode = "0";
                hexCode+=hexa[0];
            }
            else if (i == 0)
                hexCode = "00";

            return hexCode;
        }

        static String RGBtoHexa(int R, int G, int B) {
            if ((R >= 0 && R <= 255)
                    && (G >= 0 && G <= 255)
                    && (B >= 0 && B <= 255)) {

                String hexCode = "";
                hexCode += RGB(R);
                hexCode += RGB(G);
                hexCode += RGB(B);

                return hexCode;
            }
            else
                return "-1";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Unesite brojeve: ");
            int R = scanner.nextInt(), G = scanner.nextInt(), B = scanner.nextInt();
            System.out.print(RGBtoHexa(R, G, B));
        }
    }