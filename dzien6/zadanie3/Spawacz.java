package zadanie3;

public class Spawacz extends Praca{
    boolean niebezpieczna;
    @Override
  public void wykonujePrace(){
    System.out.println("zmiana danych");
    }
    public Spawacz(double pensja , double etat , boolean fajna , boolean niebezpieczna){
    super(pensja , etat , fajna);
    this.niebezpieczna = niebezpieczna;
    }
    public boolean isNiebezpieczna(){return niebezpieczna;}
    public void setNiebezpieczna(boolean niebezpieczna){this.niebezpieczna = niebezpieczna;}
}
