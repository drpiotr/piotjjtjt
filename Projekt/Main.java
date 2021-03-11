package Projekt;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] Atakinazwa = {"Prawy sierpowy ", "Lewy sierpowy ", "Kopniak w udo ", "Uderzenie z łokcia ", "Nietrafiny atak ", "Pięść w oko", "Puk puk w czoło", "Kolanko w twarz"};
        int[] Atakiwartosc = {-20, -15, -25, -13, -0, -14, -21, -30};
        int hptwoje, hpwrog;
        hptwoje = 200;
        hpwrog = 200;
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[2];
        System.out.print("Wybierz imie: ");
        person[0] = scanner.next();
        System.out.print("Wybierz Przezwisko: ");
        person[1] = scanner.next();
        System.out.println(" ");
        System.out.println("   Zacznijmy grę!!!    ");
        System.out.println(" ");
        System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        Random random1 = new Random();
        System.out.println(" ");
        System.out.println("Wróg oddaje atak");
        System.out.println(" ");
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        for (int i = 0; i < 1; i++) {
            int losuj = random1.nextInt(8);
            if (losuj == 0) {
                System.out.println(Atakinazwa[0]);
                System.out.println(Atakiwartosc[0]);
                hptwoje = hptwoje + Atakiwartosc[0];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 1) {
                System.out.println(Atakinazwa[1]);
                System.out.println(Atakiwartosc[1]);
                hptwoje = hptwoje + Atakiwartosc[1];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 2) {
                System.out.println(Atakinazwa[2]);
                System.out.println(Atakiwartosc[2]);
                hptwoje = hptwoje + Atakiwartosc[2];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 3) {
                System.out.println(Atakinazwa[3]);
                System.out.println(Atakiwartosc[3]);
                hptwoje = hptwoje + Atakiwartosc[3];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 4) {
                System.out.println(Atakinazwa[4]);
                System.out.println(Atakiwartosc[4]);
                hptwoje = hptwoje + Atakiwartosc[4];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 5) {
                System.out.println(Atakinazwa[5]);
                System.out.println(Atakiwartosc[5]);
                hptwoje = hptwoje + Atakiwartosc[5];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 6) {
                System.out.println(Atakinazwa[6]);
                System.out.println(Atakiwartosc[6]);
                hptwoje = hptwoje + Atakiwartosc[6];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 7) {
                System.out.println(Atakinazwa[7]);
                System.out.println(Atakiwartosc[7]);
                hptwoje = hptwoje + Atakiwartosc[7];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
        }
        System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Scanner sc1 = new Scanner(System.in);
        boolean programIsRunning1 = true;

        while (programIsRunning1) {
            System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): ");
            String userInput = sc1.next();

            switch (userInput) {
                case "0": {
                    System.out.println("Prawy sierpowy");
                    System.out.println(Atakiwartosc[0]);
                    hpwrog = hpwrog + Atakiwartosc[0];
                    programIsRunning1 = false;
                    break;
                }
                case "1": {
                    System.out.println("Lewy sierpowy");
                    System.out.println(Atakiwartosc[1]);
                    hpwrog = hpwrog + Atakiwartosc[1];
                    programIsRunning1 = false;
                    break;
                }
                case "2": {
                    System.out.println("Kopniak w udo");
                    System.out.println(Atakiwartosc[2]);
                    hpwrog = hpwrog + Atakiwartosc[2];
                    programIsRunning1 = false;
                    break;
                }
                case "3": {
                    System.out.println("Uderzenie z łokcia");
                    System.out.println(Atakiwartosc[3]);
                    hpwrog = hpwrog + Atakiwartosc[3];
                    programIsRunning1 = false;
                    break;
                }
                case "4": {
                    System.out.println("Nietrafiny atak ");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning1 = false;
                    break;
                }
                case "5": {
                    System.out.println("Pięść w oko");
                    System.out.println(Atakiwartosc[5]);
                    hpwrog = hpwrog + Atakiwartosc[5];
                    programIsRunning1 = false;
                    break;
                }
                case "6": {
                    System.out.println("Puk puk w czoło");
                    System.out.println(Atakiwartosc[6]);
                    hpwrog = hpwrog + Atakiwartosc[6];
                    programIsRunning1 = false;
                    break;
                }
                case "7": {
                    System.out.println("Kolanko w twarz");
                    System.out.println(Atakiwartosc[7]);
                    hpwrog = hpwrog + Atakiwartosc[7];
                    programIsRunning1 = false;
                    break;
                }
                default: {
                    System.out.println("Nietrafiny atak");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning1 = false;
                    break;
                }
            }
        }
        System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Random random2 = new Random();
        System.out.println(" ");
        System.out.println("Wróg oddaje atak");
        System.out.println(" ");
        for (int i = 0; i < 1; i++) {
            int losuj = random2.nextInt(8);
            if (losuj == 0) {
                System.out.println(Atakinazwa[0]);
                System.out.println(Atakiwartosc[0]);
                hptwoje = hptwoje + Atakiwartosc[0];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 1) {
                System.out.println(Atakinazwa[1]);
                System.out.println(Atakiwartosc[1]);
                hptwoje = hptwoje + Atakiwartosc[1];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 2) {
                System.out.println(Atakinazwa[2]);
                System.out.println(Atakiwartosc[2]);
                hptwoje = hptwoje + Atakiwartosc[2];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 3) {
                System.out.println(Atakinazwa[3]);
                System.out.println(Atakiwartosc[3]);
                hptwoje = hptwoje + Atakiwartosc[3];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 4) {
                System.out.println(Atakinazwa[4]);
                System.out.println(Atakiwartosc[4]);
                hptwoje = hptwoje + Atakiwartosc[4];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 5) {
                System.out.println(Atakinazwa[5]);
                System.out.println(Atakiwartosc[5]);
                hptwoje = hptwoje + Atakiwartosc[5];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 6) {
                System.out.println(Atakinazwa[6]);
                System.out.println(Atakiwartosc[6]);
                hptwoje = hptwoje + Atakiwartosc[6];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 7) {
                System.out.println(Atakinazwa[7]);
                System.out.println(Atakiwartosc[7]);
                hptwoje = hptwoje + Atakiwartosc[7];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
        }
        System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Scanner sc2 = new Scanner(System.in);
        boolean programIsRunning2 = true;

        while (programIsRunning2) {
            System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): ");
            String userInput = sc2.next();

            switch (userInput) {
                case "0": {
                    System.out.println("Prawy sierpowy");
                    System.out.println(Atakiwartosc[0]);
                    hpwrog = hpwrog + Atakiwartosc[0];
                    programIsRunning2 = false;
                    break;
                }
                case "1": {
                    System.out.println("Lewy sierpowy");
                    System.out.println(Atakiwartosc[1]);
                    hpwrog = hpwrog + Atakiwartosc[1];
                    programIsRunning2 = false;
                    break;
                }
                case "2": {
                    System.out.println("Kopniak w udo");
                    System.out.println(Atakiwartosc[2]);
                    hpwrog = hpwrog + Atakiwartosc[2];
                    programIsRunning2 = false;
                    break;
                }
                case "3": {
                    System.out.println("Uderzenie z łokcia");
                    System.out.println(Atakiwartosc[3]);
                    hpwrog = hpwrog + Atakiwartosc[3];
                    programIsRunning2 = false;
                    break;
                }
                case "4": {
                    System.out.println("Nietrafiny atak ");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning2 = false;
                    break;
                }
                case "5": {
                    System.out.println("Pięść w oko");
                    System.out.println(Atakiwartosc[5]);
                    hpwrog = hpwrog + Atakiwartosc[5];
                    programIsRunning2 = false;
                    break;
                }
                case "6": {
                    System.out.println("Puk puk w czoło");
                    System.out.println(Atakiwartosc[6]);
                    hpwrog = hpwrog + Atakiwartosc[6];
                    programIsRunning2 = false;
                    break;
                }
                case "7": {
                    System.out.println("Kolanko w twarz");
                    System.out.println(Atakiwartosc[7]);
                    hpwrog = hpwrog + Atakiwartosc[7];
                    programIsRunning2 = false;
                    break;
                }
                default: {
                    System.out.println("Nietrafiny atak");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning2 = false;
                    break;
                }
            }
        }
        System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Random random3 = new Random();
        System.out.println(" ");
        System.out.println("Wróg oddaje atak");
        System.out.println(" ");
        for (int i = 0; i < 1; i++) {
            int losuj = random3.nextInt(8);
            if (losuj == 0) {
                System.out.println(Atakinazwa[0]);
                System.out.println(Atakiwartosc[0]);
                hptwoje = hptwoje + Atakiwartosc[0];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 1) {
                System.out.println(Atakinazwa[1]);
                System.out.println(Atakiwartosc[1]);
                hptwoje = hptwoje + Atakiwartosc[1];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 2) {
                System.out.println(Atakinazwa[2]);
                System.out.println(Atakiwartosc[2]);
                hptwoje = hptwoje + Atakiwartosc[2];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 3) {
                System.out.println(Atakinazwa[3]);
                System.out.println(Atakiwartosc[3]);
                hptwoje = hptwoje + Atakiwartosc[3];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 4) {
                System.out.println(Atakinazwa[4]);
                System.out.println(Atakiwartosc[4]);
                hptwoje = hptwoje + Atakiwartosc[4];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 5) {
                System.out.println(Atakinazwa[5]);
                System.out.println(Atakiwartosc[5]);
                hptwoje = hptwoje + Atakiwartosc[5];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 6) {
                System.out.println(Atakinazwa[6]);
                System.out.println(Atakiwartosc[6]);
                hptwoje = hptwoje + Atakiwartosc[6];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 7) {
                System.out.println(Atakinazwa[7]);
                System.out.println(Atakiwartosc[7]);
                hptwoje = hptwoje + Atakiwartosc[7];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
        }
        System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Scanner sc3 = new Scanner(System.in);
        boolean programIsRunning3 = true;

        while (programIsRunning3) {
            System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): ");
            String userInput = sc3.next();

            switch (userInput) {
                case "0": {
                    System.out.println("Prawy sierpowy");
                    System.out.println(Atakiwartosc[0]);
                    hpwrog = hpwrog + Atakiwartosc[0];
                    programIsRunning3 = false;
                    break;
                }
                case "1": {
                    System.out.println("Lewy sierpowy");
                    System.out.println(Atakiwartosc[1]);
                    hpwrog = hpwrog + Atakiwartosc[1];
                    programIsRunning3 = false;
                    break;
                }
                case "2": {
                    System.out.println("Kopniak w udo");
                    System.out.println(Atakiwartosc[2]);
                    hpwrog = hpwrog + Atakiwartosc[2];
                    programIsRunning3 = false;
                    break;
                }
                case "3": {
                    System.out.println("Uderzenie z łokcia");
                    System.out.println(Atakiwartosc[3]);
                    hpwrog = hpwrog + Atakiwartosc[3];
                    programIsRunning3 = false;
                    break;
                }
                case "4": {
                    System.out.println("Nietrafiny atak ");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning3 = false;
                    break;
                }
                case "5": {
                    System.out.println("Pięść w oko");
                    System.out.println(Atakiwartosc[5]);
                    hpwrog = hpwrog + Atakiwartosc[5];
                    programIsRunning3 = false;
                    break;
                }
                case "6": {
                    System.out.println("Puk puk w czoło");
                    System.out.println(Atakiwartosc[6]);
                    hpwrog = hpwrog + Atakiwartosc[6];
                    programIsRunning3 = false;
                    break;
                }
                case "7": {
                    System.out.println("Kolanko w twarz");
                    System.out.println(Atakiwartosc[7]);
                    hpwrog = hpwrog + Atakiwartosc[7];
                    programIsRunning3 = false;
                    break;
                }
                default: {
                    System.out.println("Nietrafiny atak");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning3 = false;
                    break;
                }
            }
        }
        System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Random random4 = new Random();
        System.out.println(" ");
        System.out.println("Wróg oddaje atak");
        System.out.println(" ");
        for (int i = 0; i < 1; i++) {
            int losuj = random4.nextInt(8);
            if (losuj == 0) {
                System.out.println(Atakinazwa[0]);
                System.out.println(Atakiwartosc[0]);
                hptwoje = hptwoje + Atakiwartosc[0];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 1) {
                System.out.println(Atakinazwa[1]);
                System.out.println(Atakiwartosc[1]);
                hptwoje = hptwoje + Atakiwartosc[1];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 2) {
                System.out.println(Atakinazwa[2]);
                System.out.println(Atakiwartosc[2]);
                hptwoje = hptwoje + Atakiwartosc[2];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 3) {
                System.out.println(Atakinazwa[3]);
                System.out.println(Atakiwartosc[3]);
                hptwoje = hptwoje + Atakiwartosc[3];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 4) {
                System.out.println(Atakinazwa[4]);
                System.out.println(Atakiwartosc[4]);
                hptwoje = hptwoje + Atakiwartosc[4];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 5) {
                System.out.println(Atakinazwa[5]);
                System.out.println(Atakiwartosc[5]);
                hptwoje = hptwoje + Atakiwartosc[5];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 6) {
                System.out.println(Atakinazwa[6]);
                System.out.println(Atakiwartosc[6]);
                hptwoje = hptwoje + Atakiwartosc[6];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 7) {
                System.out.println(Atakinazwa[7]);
                System.out.println(Atakiwartosc[7]);
                hptwoje = hptwoje + Atakiwartosc[7];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
        }
        System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Scanner sc4 = new Scanner(System.in);
        boolean programIsRunning4 = true;

        while (programIsRunning4) {
            System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): ");
            String userInput = sc4.next();

            switch (userInput) {
                case "0": {
                    System.out.println("Prawy sierpowy");
                    System.out.println(Atakiwartosc[0]);
                    hpwrog = hpwrog + Atakiwartosc[0];
                    programIsRunning4 = false;
                    break;
                }
                case "1": {
                    System.out.println("Lewy sierpowy");
                    System.out.println(Atakiwartosc[1]);
                    hpwrog = hpwrog + Atakiwartosc[1];
                    programIsRunning4 = false;
                    break;
                }
                case "2": {
                    System.out.println("Kopniak w udo");
                    System.out.println(Atakiwartosc[2]);
                    hpwrog = hpwrog + Atakiwartosc[2];
                    programIsRunning4 = false;
                    break;
                }
                case "3": {
                    System.out.println("Uderzenie z łokcia");
                    System.out.println(Atakiwartosc[3]);
                    hpwrog = hpwrog + Atakiwartosc[3];
                    programIsRunning4 = false;
                    break;
                }
                case "4": {
                    System.out.println("Nietrafiny atak ");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning4 = false;
                    break;
                }
                case "5": {
                    System.out.println("Pięść w oko");
                    System.out.println(Atakiwartosc[5]);
                    hpwrog = hpwrog + Atakiwartosc[5];
                    programIsRunning4 = false;
                    break;
                }
                case "6": {
                    System.out.println("Puk puk w czoło");
                    System.out.println(Atakiwartosc[6]);
                    hpwrog = hpwrog + Atakiwartosc[6];
                    programIsRunning4 = false;
                    break;
                }
                case "7": {
                    System.out.println("Kolanko w twarz");
                    System.out.println(Atakiwartosc[7]);
                    hpwrog = hpwrog + Atakiwartosc[7];
                    programIsRunning4 = false;
                    break;
                }
                default: {
                    System.out.println("Nietrafiny atak");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning4 = false;
                    break;
                }
            }
        }
        System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Random random5 = new Random();
        System.out.println(" ");
        System.out.println("Wróg oddaje atak");
        System.out.println(" ");
        for (int i = 0; i < 1; i++) {
            int losuj = random5.nextInt(8);
            if (losuj == 0) {
                System.out.println(Atakinazwa[0]);
                System.out.println(Atakiwartosc[0]);
                hptwoje = hptwoje + Atakiwartosc[0];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 1) {
                System.out.println(Atakinazwa[1]);
                System.out.println(Atakiwartosc[1]);
                hptwoje = hptwoje + Atakiwartosc[1];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 2) {
                System.out.println(Atakinazwa[2]);
                System.out.println(Atakiwartosc[2]);
                hptwoje = hptwoje + Atakiwartosc[2];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 3) {
                System.out.println(Atakinazwa[3]);
                System.out.println(Atakiwartosc[3]);
                hptwoje = hptwoje + Atakiwartosc[3];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 4) {
                System.out.println(Atakinazwa[4]);
                System.out.println(Atakiwartosc[4]);
                hptwoje = hptwoje + Atakiwartosc[4];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 5) {
                System.out.println(Atakinazwa[5]);
                System.out.println(Atakiwartosc[5]);
                hptwoje = hptwoje + Atakiwartosc[5];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 6) {
                System.out.println(Atakinazwa[6]);
                System.out.println(Atakiwartosc[6]);
                hptwoje = hptwoje + Atakiwartosc[6];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
            if (losuj == 7) {
                System.out.println(Atakinazwa[7]);
                System.out.println(Atakiwartosc[7]);
                hptwoje = hptwoje + Atakiwartosc[7];
                System.out.println("");
                System.out.println("Tylko na tyle cię stać!! HAHAHAHAHA");
            }
        }
        System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
        System.out.println("Ilość życia wroga to: " + hpwrog);
        if (hptwoje < hpwrog) {
            System.out.println("Wal mocniej bo przegrasz!");
        }
        if (hpwrog < hptwoje) {
            System.out.println("Tak trzymaj!");
        }
        Scanner sc5 = new Scanner(System.in);
        boolean programIsRunning5 = true;

        while (programIsRunning5) {
            System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): ");
            String userInput = sc5.next();

            switch (userInput) {
                case "0": {
                    System.out.println("Prawy sierpowy");
                    System.out.println(Atakiwartosc[0]);
                    hpwrog = hpwrog + Atakiwartosc[0];
                    programIsRunning5 = false;
                    break;
                }
                case "1": {
                    System.out.println("Lewy sierpowy");
                    System.out.println(Atakiwartosc[1]);
                    hpwrog = hpwrog + Atakiwartosc[1];
                    programIsRunning5 = false;
                    break;
                }
                case "2": {
                    System.out.println("Kopniak w udo");
                    System.out.println(Atakiwartosc[2]);
                    hpwrog = hpwrog + Atakiwartosc[2];
                    programIsRunning5 = false;
                    break;
                }
                case "3": {
                    System.out.println("Uderzenie z łokcia");
                    System.out.println(Atakiwartosc[3]);
                    hpwrog = hpwrog + Atakiwartosc[3];
                    programIsRunning5 = false;
                    break;
                }
                case "4": {
                    System.out.println("Nietrafiny atak ");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning5 = false;
                    break;
                }
                case "5": {
                    System.out.println("Pięść w oko");
                    System.out.println(Atakiwartosc[5]);
                    hpwrog = hpwrog + Atakiwartosc[5];
                    programIsRunning5 = false;
                    break;
                }
                case "6": {
                    System.out.println("Puk puk w czoło");
                    System.out.println(Atakiwartosc[6]);
                    hpwrog = hpwrog + Atakiwartosc[6];
                    programIsRunning5 = false;
                    break;
                }
                case "7": {
                    System.out.println("Kolanko w twarz");
                    System.out.println(Atakiwartosc[7]);
                    hpwrog = hpwrog + Atakiwartosc[7];
                    programIsRunning5 = false;
                    break;
                }
                default: {
                    System.out.println("Nietrafiny atak");
                    System.out.println(Atakiwartosc[4]);
                    hpwrog = hpwrog + Atakiwartosc[4];
                    programIsRunning5 = false;
                    break;
                }
            }
            if (hptwoje < hpwrog) {
                System.out.println("    Przegrałeś " + person[1]);
            }
            if (hpwrog < hptwoje) {
                System.out.println("   ^^Pokonałeś wroga przybyszu^^");
            }
        }
    }
}
