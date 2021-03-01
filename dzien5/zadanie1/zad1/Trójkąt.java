package zadanie1.zad1;

    public class Trójkąt {
        private int bokA;
        private int podstawa;
        private int wysokość;
        private int pole;
        private int obw;

        public Trójkąt(int bokA, int podstawa, int wysokość) {
            this.bokA = bokA;
            this.podstawa = podstawa;
            this.wysokość = wysokość;
        }

        void obliczPole() {
            System.out.print("Pole trójkąta to: ");
            System.out.println("Pole: " + podstawa*wysokość/2);


        }
        void obw() {
            System.out.print("Obwód trójkąta to: ");
            System.out.println(podstawa+getBokA()+getBokA());


        }

        public int getBokA() {
            return bokA;
        }

        public void setBokA(int bokA) {
            this.bokA = bokA;
        }

        public int getPodstawa() {
            return podstawa;
        }

        public void setPodstawa(int podstawa) {
            this.podstawa = podstawa;
        }

        public int getWysokość() {
            return wysokość;
        }

        public void setWysokość(int wysokość) {
            this.wysokość = wysokość;
        }


    }
