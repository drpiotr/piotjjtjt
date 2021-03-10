package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args){
        try {
            List<String> arrayList = new ArrayList<>(10);
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Słowa do listy [" + i + "]: ");
                arrayList.add(i, scanner.next());

            }
            System.out.println(arrayList);

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.print("Wybierz element który chcesz usunąć: ");

                arrayList.remove(sc.nextInt());
                System.out.println(arrayList);
            }
            System.out.println("Tablica po usuwaniu: " + arrayList);
        }catch (Exception exception){
            System.out.println("✘✘✘✘✘✘ BŁĄD. Masz wybrać liczbę podaną obok listy aby ją usunąć. ✘✘✘✘✘✘");}
    }
}
