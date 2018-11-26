import java.util.Scanner;
    class Perulangan_For{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angka, fac, i;
        System.out.println("Menghitung nilai fac");
        System.out.print("Masukan angka : ");
        angka=sc.nextInt();
        fac=1;
        for(i=1;i<=angka;i++){
        fac=fac*i;
        }
        System.out.printf("Nilai fac angka tersebut adalah : %d", fac);
        }
    }
    