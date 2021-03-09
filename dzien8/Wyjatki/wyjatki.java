package Wyjatki;

import java.util.Scanner;
import java.util.Random;

public class wyjatki {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int losuj;
        try {
            for (int i = 0; i < 11; i++) {
                losuj = random.nextInt(99);
                array[i] = losuj;
                System.out.println(array[i]);
            }
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("tablica jest już pełna nie można umieścić więcej danych");
        }
    }
}
