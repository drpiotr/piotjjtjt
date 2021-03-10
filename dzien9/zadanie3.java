package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print("Słowa do listy [" + i + "]: ");
            arrayList.add(i, scanner.next());
        }
            Scanner sc = new Scanner(System.in);

            for (i = 0; i < 5; i++) {
                System.out.print("Wybierz element który chcesz zamienić: ");

                arrayList.remove(sc.nextInt());
                System.out.print("Wybierz słowo do listy: ");
                arrayList.add(i, scanner.next());
                System.out.println(arrayList);
            }



    }
}