package Codewars.KYU7;

/*
A laboratory is testing how atoms react in ionic state during nuclear fusion.
They introduce different elements with Hydrogen in high temperature and pressurized chamber.
Due to unknown reason the chamber lost its power and the elements in it started precipitating
Given the number of atoms of Carbon [C],Hydrogen[H] and Oxygen[O] in the chamber.
Calculate how many molecules of Water [H2O], Carbon Dioxide [CO2] and Methane [CH4]
will be produced following the order of reaction affinity below

FOR EXAMPLE:
(C,H,O) = (45,11,100)
return no. of water, carbon dioxide and methane molecules
Output should be like:
(5,45,0)
 */

import java.util.Arrays;

public class Fusion_Chamber_Shutdown️ {
    public static int[] sagorevanje(int x, int y, int z) {

        int voda = Math.min(y/2, z);
        y -= 2 * voda;
        z -= voda;

        int ugljenDioksid = Math.min(x, z/2);
        x -= ugljenDioksid;
        z -= 2 * ugljenDioksid;

        int metan = Math.min(x, y/4);

        return new int[]{voda, ugljenDioksid, metan};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sagorevanje(45, 11, 100)));
    }
}
