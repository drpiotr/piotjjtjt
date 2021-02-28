package arrays;

import java.util.Random;
import java.util.Scanner;
public class zad7_2602 {
    public static void main(String[] args){
        double[] tab={23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        Random random = new Random();
        int pierwsza,druga,trzecia,czwarta,piata,szosta;

        pierwsza = random.nextInt(9);
        druga = random.nextInt(9);

        if (tab[pierwsza]==tab[druga]){
            System.out.println("liczba "+tab[pierwsza]+ " jest równa liczbie "+tab[druga]);
        }
        else if (tab[pierwsza]>tab[druga]){
            System.out.println("liczba "+tab[pierwsza]+ " jest wieksza od liczby "+tab[druga]);
        }
        else{
            System.out.println("liczba "+tab[pierwsza]+ " jest mniejsza od liczby "+tab[druga]);
        }
        trzecia = random.nextInt(9);
        czwarta = random.nextInt(9);

        if (tab[trzecia]==tab[czwarta]){
            System.out.println("liczba "+tab[trzecia]+ " jest równa liczbie "+tab[czwarta]);
        }
        else if (tab[trzecia]>tab[czwarta]){
            System.out.println("liczba "+tab[trzecia]+ " jest wieksza od liczby "+tab[czwarta]);
        }
        else{
            System.out.println("liczba "+tab[trzecia]+ " jest mniejsza od liczby "+tab[czwarta]);
        }
        piata = random.nextInt(9);
        szosta = random.nextInt(9);

        if (tab[piata]==tab[szosta]){
            System.out.println("liczba "+tab[piata]+ " jest równa liczbie "+tab[szosta]);
        }
        else if (tab[piata]>tab[szosta]){
            System.out.println("liczba "+tab[piata]+ " jest wieksza od liczby "+tab[szosta]);
        }
        else{
            System.out.println("liczba "+tab[piata]+ " jest mniejsza od liczby "+tab[szosta]);
        }
    }
}
//random.nextInt(1000);// 0-2

