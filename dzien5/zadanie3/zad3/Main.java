package zadanie3.zad3;

import zadanie1.zad1.Trójkąt;
import zadanie2.zad2.Prostokąt;

public class Main {
    public static void main(String[] args) {
        Prostokąt prostokąt=new Prostokąt(5,4);
        Trójkąt trojkat=new Trójkąt(2,7,15);
        System.out.println("bok prostokąta: "+prostokąt.getBokA());
        System.out.println("bok trójkąta: "+trojkat.getBokA());
        if(trojkat.getBokA()== prostokąt.getBokA()) System.out.println("boki są równe");
        else if (trojkat.getBokA() > prostokąt.getBokA()) System.out.print("bok trójkąta jest dłuźszy o: " + (trojkat.getBokA()-prostokąt.getBokA()));
        else System.out.println("bok prostkąta jest dłuźszy o " + (prostokąt.getBokA()-trojkat.getBokA()));

    }
}
