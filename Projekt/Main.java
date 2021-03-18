package Projekt;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int g;

    public static void main(String[] args) throws InterruptedException {
        for (int g = 0; g < 2; g++) {
            int hptwoje, hpwrog;
            hptwoje = 960;
            hpwrog = 1300;
            double money = 1000;
            String[] Atakinazwa = {"Prawy sierpowy ", "Lewy sierpowy ", "Kopniak w udo ", "Uderzenie z łokcia ", "Nietrafiny atak ", "Pięść w oko", "Puk puk w czoło", "Kolanko w twarz", "Nietrafiny atak ", "Nietrafiny atak ", "Nietrafiny atak ", "Nietrafiny atak ", "Nietrafiny atak ", "Nietrafiny atak ", "Tajny atak bomba w oko ", "Nietrafiny atak ", "Nietrafiny atak ", "Nietrafiny atak ", "Atak z pałki teleskopowej"};
            int[] Atakiwartosc = {-20, -15, -25, -17, -0, -19, -21, -35, -0, -0, -0, -0, -0, -0, -45, -0, -0, -0, -50};
            Scanner scan = new Scanner(System.in);
            boolean menu = true;
            Scanner poziomtr = new Scanner(System.in);
            boolean poziomtrudnosci = true;

            while (menu) {
                System.out.print("Wybierz opcję: \nuruchom grę[0] \nwyświetl autora[1]  \nwyjście[2] \n");
                String userInput = scan.next();

                switch (userInput) {
                    case "0": {
                        menu = false;
                        break;
                    }
                    case "1": {
                        System.out.println(" ");
                        System.out.println("Autorem gry jest Piotr Dragan.");
                        System.out.println(" ");
                        System.out.println("Powrót do menu nastąpi automatycznie.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Gra posiada ukryte ataki (liczby od 0 do 20) ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        menu = true;
                        break;
                    }
                    case "2": {
                        System.out.println("trwa opuszczanie gry...");
                        TimeUnit.SECONDS.sleep(2);
                        System.exit(5);
                        break;
                    }
                    default: {
                        System.out.println("Podałeś niewłaściwe dane.");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Powrót do menu...");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println(" ");
                        menu = true;
                        break;
                    }
                }
            }
            Scanner scanner = new Scanner(System.in);
            String[] person = new String[2];
            System.out.println(" ");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("Ładowanie gry...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Szłeś ulicą i zaatakował cię jakiś człowiek. Chce cię okraść. Pokonaj go aby uratować swoje pieniądze.");
            System.out.print("Wybierz imie: ");
            person[0] = scanner.next();
            System.out.print("Wybierz Przezwisko: ");
            person[1] = scanner.next();
            System.out.println("Ilość pieniędzy: " + money);
            while (poziomtrudnosci) {
                System.out.println("Wybierz poziom trudności: \nłatwy[0] \nśredni[1] \nexpert[2] \nwyjście[3]");
                String userwejscie = poziomtr.next();
                switch (userwejscie) {
                    case "0": {
                        hpwrog = 1000;
                        System.out.println("Wybrałeś poziom łatwy.");
                        System.out.println("Ustawianie poziomu...");
                        TimeUnit.SECONDS.sleep(2);
                        poziomtrudnosci = false;
                        break;
                    }
                    case "1": {
                        hpwrog = 1060;
                        System.out.println("Wybrałeś poziom średni.");
                        System.out.println("Ustawianie poziomu...");
                        TimeUnit.SECONDS.sleep(2);
                        poziomtrudnosci = false;
                        break;
                    }
                    case "2": {
                        hpwrog = 1120;
                        System.out.println("Wybrałeś poziom Expert.");
                        System.out.println("Ustawianie poziomu...");
                        TimeUnit.SECONDS.sleep(2);
                        poziomtrudnosci = false;
                        break;
                    }
                    case "3": {
                        System.out.println("trwa opuszczanie gry...");
                        TimeUnit.SECONDS.sleep(2);
                        System.exit(5);
                        break;
                    }
                    default: {
                        System.out.println("Podałeś złe dane.");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Wybierz poziom trudności ponownie");
                        TimeUnit.SECONDS.sleep(2);
                        poziomtrudnosci = true;
                        break;
                    }
                }
            }
            System.out.println(" ");
            System.out.println("   Zacznijmy grę!!!    ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(" ");
            System.out.println("Ilość życia " + person[0] + " to: " + hptwoje);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Ilość życia wroga to: " + hpwrog);
            TimeUnit.SECONDS.sleep(1);
            for(int h =0; h<15; h++){
                Random random1 = new Random();
                System.out.println(" ");
                System.out.println("Wróg oddaje atak");
                TimeUnit.SECONDS.sleep(1);
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
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ilość życia wroga to: " + hpwrog);
                TimeUnit.SECONDS.sleep(1);
                if (hptwoje < hpwrog) {
                    System.out.println("Wal mocniej bo przegrasz!");
                }
                if (hpwrog < hptwoje) {
                    System.out.println("Tak trzymaj!");
                }
                Scanner sc1 = new Scanner(System.in);
                boolean programIsRunning1 = true;

                while (programIsRunning1) {
                    System.out.println("wyjście[9]");
                    System.out.print("Wybierz atak  ([0] , [1] , [2] , [3] , [4] , [5] , [6] , [7] , [8]): \n");
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
                        case "9": {
                            System.out.println("trwa opuszczanie gry...");
                            TimeUnit.SECONDS.sleep(2);
                            System.exit(5);
                            break;
                        }
                        case "14": {
                            System.out.println("Tajny atak bomba w oko");
                            System.out.println(Atakiwartosc[14]);
                            hpwrog = hpwrog + Atakiwartosc[14];
                            programIsRunning1 = false;
                            break;
                        }
                        case "18": {
                            System.out.println("Atak z pałki teleskopowej");
                            System.out.println(Atakiwartosc[18]);
                            hpwrog = hpwrog + Atakiwartosc[18];
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
            }
            System.out.println("Ilość życia " + person[1] + " to: " + hptwoje);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Ilość życia wroga to: " + hpwrog);
            TimeUnit.SECONDS.sleep(1);
            if (hptwoje < hpwrog) {
                System.out.println("    Przegrałeś " + person[1] + ", a człowiek ukradł ci pieniądze.");
                money = 0;
                System.out.println("Ilość pieniędzy: " + money);
                TimeUnit.SECONDS.sleep(2);
            }
            if (hpwrog < hptwoje) {
                System.out.println("   Wygrałeś walkę " + person[0] + " i uratowałeś swoje pieniądze.");
                money = 1000;
                System.out.println("Ilość pieniędzy: " + money);
                TimeUnit.SECONDS.sleep(2);
                System.out.println(" ");
                System.out.println(" ");
            }
        }
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        g = 0;
    }
}