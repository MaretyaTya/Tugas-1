class DeretBilGenap{
    static void deretGenap(int i) {
        if (i<=20) {
            System.out.print(i + " ");
            deretGenap (i +=2);
        }
    }
    public static void main(String[] args) {
        deretGenap (0);
    }
}