package zadanie2.zad2;

public class Main {
    public static void main(String[] args) {
        Prostokąt prostokąt=new Prostokąt(3,4);
        System.out.print("Pole prostokąta to: ");
        System.out.println(prostokąt.getPole());
        System.out.print("Przekątne prostokąta to: ");
        System.out.println(prostokąt.getPrzekątne());
        prostokąt.setBokA(7);
        prostokąt.setBokB(6);
        System.out.print("Pole prostokąta to: ");
        System.out.println(prostokąt.getPole());
        System.out.print("Przekątne prostokąta to: ");
        System.out.println(prostokąt.getPrzekątne());




    }
}
