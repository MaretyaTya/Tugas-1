class Faktorial{
    static int hitungFaktorialRekursif (int n) {
        if (n>1) {
            return n * hitungFaktorialRekursif (n-1);
        }
        else {
            return 1;
        }
    }
    static int hitungFaktorialIteratif (int n) {
        int fakt = 1;
        for (int i = n; n >=1; n--) {
            fakt = fakt * n;
        }
        return fakt;
    }
    public static void main(String[] args) {
        System.out.println(hitungFaktorialRekursif(5));
        System.out.println(hitungFaktorialIteratif(5));
    }
}