package arrays;

import java.util.Random;
import java.util.Scanner;
public class zad6_2602 {
    public static void main(String[] args){
        double[] tab = { 23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
        System.out.println("tab[0] " + tab[0] + "\ntab[1] " + tab[1] + "\ntab[2] " + tab[2] + "\ntab[3] " + tab[3] + "\ntab[4] " + tab[4] + "\ntab[5] " + tab[5] + "\ntab[6] " + tab[6]+ "\ntab[7] " + tab[7]+ "\ntab[8] " + tab[8]);
double a, b, c, d, e, f, g, h, i;
       a = tab[0];
       b = tab[1];
       c = tab[2];
       d = tab[3];
       e = tab[4];
       f = tab[5];
       g = tab[6];
       h = tab[7];
       i = tab[8];
        System.out.println(" ");
        System.out.println("Po odwróceniu");
        System.out.println(" ");
        tab[0] = i;
        tab[1] = h;
        tab[2] = g;
        tab[3] = f;
        tab[4] = e;
        tab[5] = d;
        tab[6] = c;
        tab[7] = b;
        tab[8] = a;

        System.out.println("tab[0] "+ tab[0] + "\ntab[1] " + tab[1] + "\ntab[2] " + tab[2] + "\ntab[3] " + tab[3] + "\ntab[4] " + tab[4] + "\ntab[5] " + tab[5] + "\ntab[6] " + tab[6] + "\ntab[7] " + tab[7]+ "\ntab[8] " + tab[8]);
    }
}