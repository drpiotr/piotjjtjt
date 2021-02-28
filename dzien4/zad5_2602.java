 package arrays;

import java.util.Random;
import java.util.Scanner;
        public class zad5_2602 {
            public static void main(String[] args){
                double[] tab = { 23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
                System.out.println("tab[0] " + tab[0] + "\ntab[1] " + tab[1] + "\ntab[2] " + tab[2] + "\ntab[3] " + tab[3] + "\ntab[4] " + tab[4] + "\ntab[5] " + tab[5] + "\ntab[6] " + tab[6]+ "\ntab[7] " + tab[7]+ "\ntab[8] " + tab[8]);
                System.out.println(" ");
                System.out.println("Zamiana największej liczby z najmniejszą. ");
                System.out.println(" ");
                int dlugosc = tab.length;
                double max = tab[0];
                for (int i = 0; i < dlugosc; i++) {
                    if (tab[i] > max)
                        max = tab[i];
                }
                double min = tab[0];
                for (int i = 0; i < dlugosc; i++) {
                    if (tab[i] < min)
                        min = tab[i];
                }
                System.out.println("tab[0] "+ tab[0] + "\ntab[1] " + tab[1] + "\ntab[2] " + tab[2] + "\ntab[3] " + tab[3] + "\ntab[4] " + tab[4] + "\ntab[5] " + min + "\ntab[6] " + tab[6] + "\ntab[7] " + tab[7]+ "\ntab[8] " + max);
    }
}


