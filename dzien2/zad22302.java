public class zad22302 {
    public static void main(String[] args) {
        long x1 = 1;
        long x2 = 1;
        for (int i = 3; i <= 7; i++) {
            long temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(x2);
    }
}
}


