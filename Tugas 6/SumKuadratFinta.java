import java.util.Scanner;
    class SumKuadratFinta{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n;
        int k;
        int x;
        int angka=0;
        int y;

        System.out.print("Masukan bilangan bulat : ");
        n = sc.nextInt();
        for(k=1; k<=n; k++){
            x=k*k;
            angka= angka+x;
            System.out.print(" " + angka);
        }
        System.out.println(" jadi hasilnya adalah," + angka);
    }
}