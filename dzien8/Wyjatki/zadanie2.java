package Wyjatki;

import java.util.Scanner;
import java.util.InputMismatchException;

public class zadanie2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Podaj liczbę: ");
                array[i] = scanner.nextInt();
                System.out.println("Podana liczba to: " + array[i]);
                System.out.println("Komórka w tablicy o numerze " + i + " ma wartość: " + array[i]);
            }
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("   <<<tablica jest już pełna nie można umieścić więcej danych>>>");}
        catch (InputMismatchException inputMismatchException) {
            System.out.println("   <><>błedne liczby<><>   ");
            System.out.println("       ☠\uD83D\uDEAD\uD83D\uDEAD⚠⚠\uD83D\uDEAD\uD83D\uDEAD☠   ");}
    }
}