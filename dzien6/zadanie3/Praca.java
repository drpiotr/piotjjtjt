package zadanie3;

public class Praca {
    private double pensja;
    private double etat;
    boolean fajna;
    public void wykonujePrace(){
        System.out.println("wykonuje pracę");
    }
    public Praca(double pensja , double etat , boolean fajna){
        this.pensja = pensja;
        this.etat = etat;
        this.fajna = fajna;
    }
    public double getPensja(){return pensja;}
    public void setPensja(double pensja){this.pensja = pensja;}
    public double getEtat(){return etat;}
    public void setEtat(double etat){this.etat = etat;}
    public boolean isFajna(){return fajna;}
    public void setFajna(boolean fajna){this.fajna = fajna;}
}
