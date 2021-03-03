package zadanie1;

public class Kwadrat extends Figura {
    private static double polekwadrat;

    public Kwadrat(double boka) {
        super(boka);
        polekwadrat = boka * boka;
    }
        public static double getPolekwadrat() {
            return polekwadrat;
        }
        public void setPolekwadrat ( double n){
            polekwadrat += n;
        }
}
