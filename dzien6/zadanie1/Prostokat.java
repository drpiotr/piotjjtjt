package zadanie1;

public class Prostokat extends Figura{
private static double poleprostokat;

public Prostokat(double boka , double bokb){
    super(boka , bokb);
    poleprostokat = boka * bokb;
}
public static double getPoleprostokat(){return poleprostokat;}
public void setPoleprostokat(double i){
    poleprostokat +=i;
}
}

