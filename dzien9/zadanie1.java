package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        for(int i=0 ; i<10 ; i++){
            System.out.print("Słowa do listy [" + i + "]: ");
            arrayList.add(i,scanner.next());

        }
        System.out.println("Słowa wczytane do listy: " + arrayList);
    }
}
