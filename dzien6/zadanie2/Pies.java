package zadanie2;

public class Pies extends Zwierze{
    private String siersc;
    private double dlugoscogona;
    public Pies(double wiek , double ilosckonczyn , String nazwa , String siersc , double dlugoscogona){
        super(wiek , ilosckonczyn , nazwa);
        this.siersc = siersc;
        this.dlugoscogona = dlugoscogona;
    }
    public void dajglos(){
        System.out.println("hau hau");
    }
    public String getSiersc(){return siersc;}
    public void setSiersc(String siersc){this.siersc = siersc;}
    public double getDlugoscogona(){return dlugoscogona;}
    public void setDlugoscogona(double dlugoscogona){this.dlugoscogona = dlugoscogona;}
    }

