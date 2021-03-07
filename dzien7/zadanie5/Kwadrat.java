package zadanie5;

public class Kwadrat implements ObliczeniaDlaFigur{
    private double bokA;
    @Override
    public void obliczpole(){
        System.out.println(bokA * bokA);
    }
    @Override
    public void obliczobwod(){
        System.out.println(bokA * 4);
    }
    public Kwadrat(double bokA){this.bokA = bokA;}
}
