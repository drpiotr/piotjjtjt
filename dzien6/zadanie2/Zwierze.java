package zadanie2;

public class Zwierze {
    private double wiek;
    private double ilosckonczyn;
    private String nazwa;

    public Zwierze(double wiek , double ilosckonczyn , String nazwa){
        this.wiek = wiek;
        this.ilosckonczyn = ilosckonczyn;
        this.nazwa = nazwa;
    }
    public void dajglos(){
        System.out.println("daje głos");
    }
    double getWiek(){return wiek;}
    public void setWiek(double wiek){this.wiek = wiek;}
    double getIlosckonczyn(){return ilosckonczyn;}
    public void setIlosckonczyn(double ilosckonczyn){this.ilosckonczyn = ilosckonczyn;}
    String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa = nazwa;}
}

