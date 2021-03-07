package zadanie4;

public class Pies extends Zwierze implements Zwierzedomowe{
    @Override
    public void ratujwlasciciela(){
        System.out.println("Ratuje wlasciciela");
    }
    @Override
    void bedziezly(){
        System.out.println("jest bardzo zły");
    }
}
