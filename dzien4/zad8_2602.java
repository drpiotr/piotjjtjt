package arrays;

import java.util.Scanner;
public class zad8_2602 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[5];// 0 - 3

        System.out.println("Wybierz imie:");
        person[0] = scanner.next();
        System.out.println("Wybierz Rasa:");
        person[1] = scanner.next();
        System.out.println("Wybierz Klasa:");
        person[2] = scanner.next();
        System.out.println("Wybierz Broń:");
        person[3] = scanner.next();
        System.out.println("Wybierz Przezwisko:");
        person[4] = scanner.next();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);
        System.out.println(person[4]);
    }
}
